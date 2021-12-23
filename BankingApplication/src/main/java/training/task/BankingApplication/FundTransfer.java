package training.task.BankingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class FundTransfer {

    @Autowired
    Account afterTransactionBalance;


    public void transfer(double transferAmount, @Autowired
            Customer customerAmount, String withdrawalOrDeposit) {
        switch (withdrawalOrDeposit) {
            case "withdraw":{ double balance = afterTransactionBalance.withdrawalAmount(transferAmount);
                customerAmount.setAccountBalance(balance);
                System.out.println("After Amount withdraw " + balance);}
                break;
            case "deposit":
                double balance = afterTransactionBalance.depositAmount(transferAmount);
                customerAmount.setAccountBalance(balance);
                System.out.println("After Amount deposit " +balance );
        }
    }
}
