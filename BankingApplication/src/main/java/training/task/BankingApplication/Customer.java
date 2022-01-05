//package training.task.BankingApplication;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.lang.reflect.Constructor;
//import java.util.ArrayList;
//
//@Component
//@Scope("prototype")
//public class Customer<T> {
//    String customerName;
//    int customerId;
//    String address;
//    String mobileNumber;
//
//    @Autowired
//    Account account;
//    @Autowired
//    Login login;
//
//    Customer() {
//    }
//
////    public Customer(String customerName, int customerId, String address, long mobileNumber) {
////        this.customerName = customerName;
////        this.customerId = customerId;
////        this.address = address;
////        this.mobileNumber = mobileNumber;
////        // this.account = account;
////    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public void setCustomerId(int customerId) {
//        this.customerId = customerId;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        this.account.accountNumber = accountNumber;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public int getCustomerId() {
//        return customerId;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public int getAccountNumber() {
//        return account.accountNumber;
//    }
//
//    public void setAccountBalance(double accountBalance) {
//        this.account.balance = accountBalance;
//    }
//
//    public double getAccountBalance() {
//        return account.balance;
//    }
//
//
//    public void showCustomerDetails() {
//        if (customerId == account.accountNumber) {
//            System.out.println("Customer name: " + this.customerName);
//            System.out.println("Customer Id: " + this.customerId);
//            System.out.println("Customer address: " + this.address);
//            System.out.println("Customer Mobile Number: " + this.mobileNumber);
//            System.out.println("Customer Account Number: " + this.account.getAccountNumber());
//            System.out.println("Customer balance: " + this.account.getBalance());
//        }
//    }
//
//
//}
