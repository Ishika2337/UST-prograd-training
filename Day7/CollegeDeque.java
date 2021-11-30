import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class CollegeDeque {
    public static void main(String[] args) {
        ArrayDeque<String> branchName = new ArrayDeque<>();
        branchName.addAll(List.of("CSE", "EEE", "EE", "ECE", "ME", "CE"));
        ArrayDeque<Integer> numOfStudent = new ArrayDeque<>();
        numOfStudent.addAll(List.of(60, 10, 45, 30, 50, 40));
        System.out.println("Branch name"+ "      "+ "Number of students");
        for(Iterator<String> bn = branchName.iterator(); bn.hasNext();){
            for(Iterator<Integer> ns = numOfStudent.iterator(); ns.hasNext();){
                System.out.println(bn.next() +"                  " +ns.next());
            }
        }

    }
}
