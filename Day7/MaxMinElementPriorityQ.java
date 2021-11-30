import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MaxMinElementPriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
        min.addAll(List.of(10,5,2,9,8));
        max.addAll(List.of(10,5,2,9,8));
        for(Iterator<Integer> me = min.iterator(); me.hasNext();){
            System.out.println(me.next());
        }
        System.out.println("Minimum Element: "+ min.poll());
        for(Iterator<Integer> maxe = max.iterator(); maxe.hasNext();){
            System.out.println(maxe.next());
        }
        System.out.println("Maximum Element: "+ max.poll());
    }
}
