package training.task.BankingApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FundTransfer {

    @Autowired
    Account fromAccount1;
    @Autowired
    Account toAccount1;

    ArrayList<Integer> accountNumber = new ArrayList(List.of(100,101));


    public void transfer(double transferAmount, int fromAccount, int toAccount) {
        if (accountNumber.contains(fromAccount)  && accountNumber.contains(toAccount)){
            fromAccount1.withdrawalAmount(transferAmount);
            toAccount1.depositAmount(transferAmount);
            System.out.println("Transfer Successfully");
        }
        else {
            System.out.println("Fail Transfer");
        }
    }
}
