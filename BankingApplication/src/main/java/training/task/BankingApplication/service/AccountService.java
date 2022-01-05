package training.task.BankingApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.task.BankingApplication.entity.Account;
import training.task.BankingApplication.entity.RegisteredCustomer;
import training.task.BankingApplication.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> accountList() {
        return accountRepository.findAll();
    }

    public Account getById(String accountNumber){
        return accountRepository.findById(accountNumber).get();
    }


//    public void checkIds(RegisteredCustomer customer, Account account){
//        if (customer.getID().equals(account.getAccountId())){
//            saveAccount(account);
//        }
//    public double withdrawalAmount(double withdrawalAmount){
//        if (this.account.getBalance() >= withdrawalAmount){
//            this.account.setBalance(this.account.balance-withdrawalAmount);
//        }
//        else {
//            System.out.println("Insufficient Balance");
//        }
//        return this.account.getBalance();
//    }
//    public double depositAmount(double depositAmount){
//        this.account.setBalance(this.account.balance+depositAmount);
//        return this.account.getBalance();
//    }
}
