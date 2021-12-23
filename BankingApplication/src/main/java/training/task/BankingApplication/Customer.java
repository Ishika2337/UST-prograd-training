package training.task.BankingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;

@Component
@Scope("prototype")
public class Customer {
    String customerName;
    int customerId;
    String address;
    long mobileNumber;

    @Autowired
    Account account;

    Customer() {
    }

//    public Customer(String customerName, int customerId, String address, long mobileNumber) {
//        this.customerName = customerName;
//        this.customerId = customerId;
//        this.address = address;
//        this.mobileNumber = mobileNumber;
//        // this.account = account;
//    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.account.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return account.accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.account.balance = accountBalance;
    }
    public double getAccountBalance(){
        return account.balance;
    }


    public void showCustomerDetails() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Customer Id: " + customerId);
        System.out.println("Customer address: " + address);
        System.out.println("Customer Mobile Number: " + mobileNumber);
        System.out.println("Customer Account Number: " + account.getAccountNumber());
        System.out.println("Customer balance: " + account.getBalance());
    }


}
