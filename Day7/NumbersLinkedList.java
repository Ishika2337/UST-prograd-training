import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NumbersLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(0,2);
        num.addAll(List.of(3, 5, 4, 7, 9, 10, 0, 8, 8));
        System.out.println("All Numbers");
         for(Iterator<Integer> ij = num.iterator(); ij.hasNext();){
             System.out.println(ij.next());
         }
        num.set(7,12);
        num.forEach(nm -> System.out.print(nm+"  "));
         //Print even Numbers
        System.out.print("\nEven Numbers: ");
         num.removeIf(n -> (n%2)!=0);
        num.forEach(evenNum -> System.out.print(evenNum+",  "));
        num.addFirst(200);
        System.out.println("\n");
        num.forEach(nm -> System.out.print(nm+"  "));

    }
}
