import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for(int i = 0; i<=10; i++)
            v.add(i);
        v.forEach(num -> System.out.println(num));

        v.remove(5);
        v.forEach(num -> System.out.println(num));

        v.addAll(List.of(20, 30, 40));
        v.forEach(num -> System.out.print(num +"    "));

        System.out.println("\nSize of array " + v.size());

    }
}
