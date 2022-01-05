package training.task.BankingApplication.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Account {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "training.task.BankingApplication.autoGenerator.codeGenerator")
    private String accountNumber;
    private Double balance = 0.0;
    @OneToOne(mappedBy = "account")
    private RegisteredCustomer customer;

    public Account() {

    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public RegisteredCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(RegisteredCustomer customer) {
        this.customer = customer;
    }
}
