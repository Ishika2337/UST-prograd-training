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

    public Account(String branch, int accountNumber, double balance) {
        this.branch = branch;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double withdrawalAmount(double withdrawalAmount){
        if (balance >= withdrawalAmount){
            this.balance = this.balance-withdrawalAmount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
        return this.balance;
    }
    public double depositAmount(double depositAmount){
        this.balance= this.balance+depositAmount;
        return this.balance;
    }
}
