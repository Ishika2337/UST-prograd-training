public class Account {
    public long accNum;
    public String name;
    public long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public void info(){
        accNum = 109087563;
        name = "Ishika";
        System.out.println("Name: " + name);
        System.out.println("acc. num: " + accNum);
        System.out.println("Balance: " + this.balance);
    }

    public void cashDeposite(long depositeAmt){
        this.balance = this.balance + depositeAmt;
        System.out.println(this.balance);
    }
    public  void cashWithdrawal(long withdrawAmt){
        if(this.balance>withdrawAmt){
            System.out.println( withdrawAmt + " amount is withdraw and Current balance is: " + (this.balance-withdrawAmt));
        }else {
            System.out.println("Your balance is low " + this.balance);
        }
    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long amt = 1000;
        int l=0;
        String x;
        Account account = new Account(amt);
        do {
            System.out.println("1. Cash Deposite");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Account Info");
            int i = scanner.nextInt();
            switch(i) {
                case 1:
                    System.out.print("How Much amount you want to Deposite: ");
                    long dAmt = scanner.nextLong();
                    account.cashDeposite(dAmt);
                    break;
                case 2:
                    System.out.print("How Much amount you want to Withdraw: ");
                    long wAmt = scanner.nextLong();
                    account.cashWithdrawal(wAmt);
                    break;
                case 3: account.info();
                default:
                    System.out.println("you choose wrong option");
            }
            System.out.println("do you have another transaction(y/n)");
            x = scanner.next();
            if (x=="n"){
                l = 1;
            }
        }while (l != 0);
    }
}
