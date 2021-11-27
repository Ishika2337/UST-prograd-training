import java.util.Scanner;

@FunctionalInterface
interface Addition {
    public int add(int a,int b);
}
interface Subtraction {
    public int sub(int a,int b);
}
interface Multiplication {
    public int mul(int a,int b);
}
interface Division {
    public int div(int a,int b);
}
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(" **** Operation You Want to Perform on Numbers ****");
            System.out.println("Add    Mul    Sub    Div   Exit");
            String operation = scanner.nextLine();
            if (operation.equals("exit")) {
                System.out.println("Exit");
                break;
            }
            try {
            System.out.println("Enter Number 1:");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Number 2:");
            int num2 = Integer.parseInt(scanner.nextLine());

                    switch (operation) {
                        case "add":
                            Addition add1 = (int a, int b) -> {
                                return (a + b);
                            };
                            System.out.println("Addition: " + add1.add(num1, num2));
                            break;

                        case "sub":
                            Subtraction sub1 = (int a, int b) -> {
                                return (a - b);
                            };
                            System.out.println("Subtraction: " + sub1.sub(num1, num2));
                            break;

                        case "mul":
                            Multiplication mul1 = (int a, int b) -> {
                                return (a * b);
                            };
                            System.out.println("Multiplication: " + mul1.mul(num1, num2));
                            break;

                        case "div":
                            Division div1 = (int a, int b) -> {
                                return (a / b);
                            };
                            System.out.println("Division: " + div1.div(num1, num2));
                            break;

                        default:
                            System.out.println("Wrong Choice");
                    }

                }catch (NumberFormatException nfe){
                System.out.println("Enter valid Number {Integer}");
            } catch (ArithmeticException ae) {
                    System.out.println("Can't divide by zero");
                }
            }
        }
    }
