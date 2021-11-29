/*Write a java program that let the user choose his/her username and password.
The program verifies whether the chosen username and password are valid.
If either one of them is invalid, it notifies the user by raising exception and explain the
cause of invalidity. The rules for choosing valid usernames and passwords are:
a. A username must be of length 6-15 characters.
b. A username must start with an uppercase English alphabet A to Z.
c. A password must not be shorter than 8 characters but must not exceed 256.
d. There cannot be any types of parentheses or whitespaces in a valid username or password.
e. A password cannot contain or be the same as its associated username
 */

import java.util.Scanner;


public class Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String name = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        UsernameValidator usernameValidator = new UsernameValidator();
        PasswordValidator passwordValidator = new PasswordValidator();
        try {
            usernameValidator.isValid(name);
            passwordValidator.isValidPassword(password,name);

        }catch (ValidUsernameException vn){
            System.out.println(vn.printMessage());
        } catch (ValidPasswordException vpe){
            System.out.println(vpe.printMessagePassword());
        }


    }
}
