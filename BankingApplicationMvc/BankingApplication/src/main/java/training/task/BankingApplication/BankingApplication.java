package training.task.BankingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

/* Create a Spring Boot application for ABC Bank. using this application,the customers of the bank
should be able to access their account details and transfer funds to the other accounts of the same bank.
This application should consist of the following entities:
Customer: To store information about the customers of the bank
Account:To store information about the existing accounts of the bank
FundTransfer: To store information about the funds that are transferred from one account to the other.
Create the application and inject dependencies in the entities.
*/

@SpringBootApplication
public class BankingApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BankingApplication.class, args);
        Customer customer1 = context.getBean(Customer.class);
        Customer customer2 = context.getBean(Customer.class);
        //Account account = context.getBean(Account.class);
        FundTransfer fundTransfer = context.getBean(FundTransfer.class);


        customer1.setCustomerId(100);
        customer1.setCustomerName("Ishika");
        customer1.setAddress("Ganesh nagar");
        customer1.setMobileNumber("9887745939");
        customer1.setAccountNumber(100);
        customer1.setAccountBalance(2000);
        customer1.showCustomerDetails();

        customer2.setCustomerId(101);
        customer2.setCustomerName("Garima");
        customer2.setAddress("Ramganj");
        customer2.setMobileNumber("9530290770");
        customer2.setAccountNumber(101);
        customer2.setAccountBalance(3000);
        customer2.showCustomerDetails();

        fundTransfer.transfer(1000,100,101);
    }

}
