import java.util.Scanner;

/* Let's say you have an integer array and string array. write a single method printArray
that can print all the elements of both arrays in the reverse order.
 */
class Printer <T> {

    void printArray(T[] input) {
        int length = input.length;
        for (int i = length - 1; i >= 0; i--) {
            System.out.println(input[i] + " ");
        }
    }
}
public class Reverse{
    public static void main(String[] args) {
        Printer print = new Printer();
        //Scanner scanner = new Scanner(System.in);
        Integer[] numArray = {1, 2, 3};
        String[] stringArr = {"Ishika", "Gammu"};
        print.printArray(numArray);
        print.printArray(stringArr);
    }
}
