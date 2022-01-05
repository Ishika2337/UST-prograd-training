package training.task.BankingApplication.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class RegisteredCustomer {
    @Id
    private String userName;
    @Column(nullable = false)
    private String customerName;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    private String customerAddress;
    @Column(nullable = false)
    private String password;
    @JsonIgnore
    @OneToOne
    private Account account;

    public RegisteredCustomer() {
    }


    public RegisteredCustomer(String userName, String customerName, String phoneNumber, String customerAddress, String password) {
        this.userName = userName;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.customerAddress = customerAddress;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}