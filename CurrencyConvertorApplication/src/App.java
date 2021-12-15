//Make a console based currency converter application with suppport for atleast 5 currencies.
//Requirements:
//1. Must be a menu driven program.
//2. All currencies to be displayed correct upto 2 decimal places.
//3. Each interaction of the user with the program must be logged in a log.txt file 'log.txt` example contents -
// Program started. User selected INR, User selected USD, User entered amount 1400, Program stopped.
//4. Add exception handling for when user enters invalid amount or chooses invalid option

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class App {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;
        fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
        logger.info("Program Started...");
        Scanner scanner = new Scanner(System.in);
        Amount amount = new Amount();
        CurrencyConvertor currencyConvertor = new CurrencyConvertor();
        double money, convertedAmount;
        int l = 0;
        String anotherTransaction;
        do {
            System.out.println("In which Currency you want to Convert: ");
            System.out.println("1.  INR to USD");
            System.out.println("2.  USD to INR");
            System.out.println("3.  EUR to INR");
            System.out.println("4.  GBP to INR");
            System.out.println("5.  AUD to INR");
            System.out.println("6.  INR to EUR");
            System.out.println("7.  INR to GBP");
            System.out.println("8.  INR to AUD");
            System.out.println("9.  EUR to USD");
            System.out.println("10. EUR to GBP");
            System.out.println("11. EUR to AUD");
            System.out.println("12. USD to EUR");
            System.out.println("13. USD to GBP");
            System.out.println("14. USD to AUD");
            System.out.println("15. GBP to USD");
            System.out.println("16. GBP to EUR");
            System.out.println("17. GBP to AUD");
            System.out.println("18. AUD to GBP");
            System.out.println("19. AUD to USD");
            System.out.println("20. AUD to EUR");

            int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    logger.info("User selected INR to USD");
                    System.out.println("******INR to USD******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.inrToUsd(money));
                    System.out.println(convertedAmount);
                    break;
                }

                case 2: {
                    logger.info("User selected USD to INR");
                    System.out.println("******USD to INR******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.usdToInr(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 3: {
                    System.out.println("******EUR to INR******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.eurToInr(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 4: {
                    System.out.println("******GBP to INR******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.gbpToInr(money));
                    System.out.println(convertedAmount);;
                    break;
                }
                case 5: {
                    System.out.println("******AUD to INR******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.audToInr(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 6: {
                    System.out.println("******INR to EUR******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.inrToEur(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 7: {
                    System.out.println("******INR to GBP******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.inrToGbp(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 8: {
                    System.out.println("******INR to AUD******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.inrToAud(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 9: {
                    System.out.println("******EUR to USD******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.eurToUsd(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 10: {
                    System.out.println("******EUR to GBP******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.eurToGbp(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 11: {
                    System.out.println("******EUR to AUD******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.eurToAud(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 12: {
                    System.out.println("******USD to EUR******");
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.usdToEur(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 13: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.usdToGbp(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 14: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.usdToAud(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 15: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.gbpToUsd(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 16: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.gbpToEur(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 17: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.gbpToAud(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 18: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.audToGbp(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 19: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.audToUsd(money));
                    System.out.println(convertedAmount);
                    break;
                }
                case 20: {
                    money = amount.getAmount();
                    logger.info("User Entered amount: "+ money);
                    convertedAmount= round(currencyConvertor.audToEur(money));
                    System.out.println(convertedAmount);
                    break;
                }

                default:
                    throw new IllegalArgumentException("You entered wrong Choice");
            }
            System.out.println("do you want Other conversions (y/n)");
            anotherTransaction = scanner.next();
            if (anotherTransaction.equals("y")) {
                l = 1;
            }

        } while (l != 0);
        logger.info("Program Stopped..");

    }
    public static double round(double value) {
        return (double) Math.round(value * 100) / 100;
    }

}
