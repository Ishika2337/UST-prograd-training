package training.task.BankingApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import training.task.BankingApplication.entity.Account;
import training.task.BankingApplication.entity.RegisteredCustomer;
import training.task.BankingApplication.service.AccountService;
import training.task.BankingApplication.service.CustomerService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AccountService accountService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/registration")
    public String register() {
        return "registration";
    }

    @RequestMapping("/details")
    public String details() {
        return "details";
    }

    @RequestMapping("/customerList")
    @ResponseBody
    public List<RegisteredCustomer> list() {
        return customerService.customerList();
    }

    //Create Customer in DB
    @PostMapping("/home")
    public String registration(HttpServletRequest request, Model model) {
        String name = request.getParameter("customerName");
        String userName = request.getParameter("userName");
        String phoneNumber = request.getParameter("phoneNumber");
        String address = request.getParameter("customerAddress");
        String password = request.getParameter("Password");
        // System.out.println(address);
        //Assign account to the Customer
        Account account = accountService.saveAccount(new Account());
        RegisteredCustomer customer = new RegisteredCustomer(userName, name, phoneNumber, address, password);
        customer.setAccount(account);
        customerService.createCustomer(customer);
        return "home";
    }

    //Login
    //TODO: use session or cookies
    // TODO: create new get route for details
    @PostMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        //String accountNumber = request.getParameter("accountNumber");
        RegisteredCustomer customer;
        //Account account;
        if (customerService.existsById(userName)) {
            customer = customerService.findById(userName);
            // account = accountService.getById(accountNumber);
            if (password.equals(customer.getPassword())) {
                model.addAttribute("message", "Login Successfully");
                model.addAttribute("name", customer.getCustomerName());
                model.addAttribute("userName", customer.getUserName());
                model.addAttribute("mobileNumber", customer.getPhoneNumber());
                model.addAttribute("address", customer.getCustomerAddress());
                model.addAttribute("accountNumber", customer.getAccount().getAccountNumber());
                model.addAttribute("balance", customer.getAccount().getBalance());
            } else {
                model.addAttribute("message", "invalid Password");
                return "login";
            }
        } else {
            model.addAttribute("message", "invalid username");
            return "login";
        }
        return "details";
    }

    //Update
    @RequestMapping("/updateCustomer/{id}")
    public String updateCustomerForm(@PathVariable String id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "updateCustomer";
    }

    @PostMapping("/details")
    public String updateCustomer(HttpServletRequest request, Model model) {
        //System.out.println(customer);
        //System.out.println(id);
        //get Customer from DB
        RegisteredCustomer existingCustomer = customerService.findById(request.getParameter("userName"));
        //existingCustomer.setUserName(customer.getUserName());
        existingCustomer.setCustomerName(request.getParameter("customerName"));
        existingCustomer.setCustomerAddress(request.getParameter("customerAddress"));
        existingCustomer.setPhoneNumber(request.getParameter("phoneNumber"));
        existingCustomer.setPassword(request.getParameter("password"));
        customerService.updateCustomer(existingCustomer);
        model.addAttribute("name", existingCustomer.getCustomerName());
        model.addAttribute("userName", existingCustomer.getUserName());
        model.addAttribute("mobileNumber", existingCustomer.getPhoneNumber());
        model.addAttribute("address", existingCustomer.getCustomerAddress());
        model.addAttribute("accountNumber", existingCustomer.getAccount().getAccountNumber());
        model.addAttribute("balance", existingCustomer.getAccount().getBalance());
        return "details";
    }

    //Deposit
    @GetMapping("/deposit/{accountNumber}")
    public String depositForm(@PathVariable String accountNumber, Model model) {
        //System.out.println("ACCOUNT NUMBER  "+accountNumber);
        //model.addAttribute("account", accountService.getById(accountNumber));
       model.addAttribute("accountNumber", accountNumber);
        return "deposit";
    }

    @PostMapping("/deposit/{accountNumber}")
    public String deposit(@PathVariable String accountNumber, HttpServletRequest request, Model model) {
        Account account = accountService.getById(accountNumber);
        Double amount = Double.parseDouble(request.getParameter("amount"));
            account.deposit(amount);
            accountService.saveAccount(account);
            model.addAttribute("message", "Deposited successfully");
        return "deposit";
    }

    // withdraw
    @GetMapping("/withdraw/{accountNumber}")
    public String withdrawForm(@PathVariable String accountNumber, Model model) {
        model.addAttribute("accountNumber", accountNumber);
        return "withdraw";
    }

    @PostMapping("/withdraw/{accountNumber}")
    public String withdraw(@PathVariable String accountNumber, HttpServletRequest request, Model model) {
        Double amount = Double.parseDouble(request.getParameter("amount"));
            Account account = accountService.getById(accountNumber);
            if (account.getBalance() <= amount) {
                model.addAttribute("message", "insufficient Amount");
            } else {
                account.withdraw(amount);
                accountService.saveAccount(account);
                model.addAttribute("message", "Withdraw successfully");
            }
        return "withdraw";
    }

    //Fund Transfer
    @GetMapping("/fundTransfer/{accountNumber}")
    public String fundTransferForm(@PathVariable String accountNumber, Model model) {
        model.addAttribute("accountNumber", accountNumber);
        return "fundTransfer";
    }

    @PostMapping("/fundTransfer/{accountNumber}")
    public String fundTransfer(@PathVariable String accountNumber, HttpServletRequest request, Model model) {

        String toAccount = request.getParameter("toAccount");
        Double amount = Double.parseDouble(request.getParameter("amount"));


        if (accountService.existAccount(toAccount)) {
            Account account1 = accountService.getById(accountNumber);
            Account account2 = accountService.getById(toAccount);
            if (account1.getBalance() <= amount) {
                model.addAttribute("message", "insufficient Amount in your Account");
            } else {
                account1.withdraw(amount);
                account2.deposit(amount);
                accountService.saveAccount(account1);
                accountService.saveAccount(account2);
                model.addAttribute("message", "Transaction done successfully");
            }
        }
        else {
            model.addAttribute("message", "Account does not Exist! Please Enter valid Account Number");
        }
        return "fundTransfer";
    }


//    @RequestMapping("/delete")
//    @ResponseBody
//    public String deleteCustomer(RegisteredCustomer id) {
//        customerService.deleteCustomer(id);
//        return "deleted";
//    }


//    // Account
//    @RequestMapping("/deposit")
//    public String deposit() {
//        return "deposit";
//    }
//
//    @PostMapping("/details")
//    public String depositDetails(@ModelAttribute("deposit") Account account) {
//        accountService.saveAccount(account);
//        return "details";
//    }
//
//    @RequestMapping("/accountList")
//    @ResponseBody
//    public List<Account> accountList() {
//        return accountService.accountList();
//    }
}
