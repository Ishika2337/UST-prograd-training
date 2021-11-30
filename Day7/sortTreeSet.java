import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class sortTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.addAll(List.of(10,9,7,4,100,-8,3,6));
        //System.out.println(numbers.ceiling(10));
       // System.out.println(numbers.comparator());
        for(Iterator<Integer> num = numbers.iterator(); num.hasNext();){
            System.out.println(num.next());
        }

    }
}
