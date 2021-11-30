import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> name1 = new ArrayList<>(List.of("Garima", "Nivedita", "Nishit", "Pankaj"));
        // Add name of student of class 10th
        name.add("Ishika");
        name.addAll(name1);
        System.out.println("Student Names");
        // Display all students
        name.forEach(studentNames -> System.out.println(studentNames));
        // Students who withdrawal their seats
        if(name.contains("Ishika")) {
            System.out.println("Ishika Clear the exam");
        }

        System.out.println("Student who fail the exam: "+ name.get(4));
        if(name.get(4) == "Pankaj"){
            name.remove(4);
        }
        System.out.println("\nFinal list of student who pass the exam\n ");
        name.forEach(finalName -> System.out.println(finalName));




    }
}
