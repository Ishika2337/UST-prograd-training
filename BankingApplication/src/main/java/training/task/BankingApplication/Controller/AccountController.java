package training.task.BankingApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import training.task.BankingApplication.entity.Account;
import training.task.BankingApplication.service.AccountService;
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

        // Account
    @GetMapping("/accounts")
    public String account() {
        return "createAccount";
    }

    @PostMapping("/account/new")
    public String addAccount(@ModelAttribute("account") Account account) {
        accountService.saveAccount(account);
        return "createAccount";
    }
    //@GetMapping("")
}
