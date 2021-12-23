package training.task.BankingApplication;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Account {
    int accountNumber;
    String branch;
    double balance;

    Account() {
        //balance=3000;
    }

//    public Account(String branch, int accountNumber, double balance) {
//        this.branch = branch;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public void setAccount(String branch, int accountNumber, double balance) {
//        this.branch = branch;
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double withdrawalAmount(double withdrawalAmount){
        if (balance >= withdrawalAmount){
            balance = balance-withdrawalAmount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return balance;
    }
    public double depositAmount(double depositAmount){
        balance= balance+depositAmount;
        return balance;
    }
}
