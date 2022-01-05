//package training.task.BankingApplication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//
//@Controller
//public class BankingApplicationController {
//    @Autowired
//    Customer customer;
//
//    @RequestMapping("/")
//    public String home(){
//        return "home";
//    }
//
//    @RequestMapping("/login")
//    public String login() {
//        return "login";
//    }
//
//    @RequestMapping("/details")
//    public String details(Model model, HttpServletRequest request) {
//        String username = request.getParameter("name");
//        String password = request.getParameter("password");
//
//        if  (username.equals("Ishika") && password.equals("Ishika@")) {
//            customer.setCustomerName("Ishika Verma");
//            customer.setMobileNumber("9887745939");
//            customer.setAddress("Ganesh Nagar");
//            customer.setAccountNumber(100);
//            customer.setAccountBalance(5000);
//            model.addAttribute("name", customer.getCustomerName());
//            model.addAttribute("mobileNumber", customer.getMobileNumber());
//            model.addAttribute("address", customer.getAddress());
//            model.addAttribute("accountNumber", customer.getAccountNumber());
//            model.addAttribute("balance", customer.getAccountBalance());
//        }
//        return "details";
//    }
//}
