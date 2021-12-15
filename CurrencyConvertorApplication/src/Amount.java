import java.util.Scanner;

public class Amount {
    double amount;

    //    Amount(double amount){
//        this.amount = amount;
//    }
    public double getAmount() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Amount: ");
            amount = scanner.nextDouble();
            if (amount <= 0) {
                throw new IllegalArgumentException("Money can't be Zero or Negative");
            }

        } catch (IllegalArgumentException iae) {
            System.out.println("Money can't be Zero or Negative");
        }
        return amount;
    }
}