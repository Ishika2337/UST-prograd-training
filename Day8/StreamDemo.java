import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        marks.addAll(List.of(90,67,45,70,77,80,50,99));
        names.addAll(List.of("Ishika", "Pankaj", "Nishit", "Bhawna", "Varsha", "Nivedita", "Garima","Nivedita", "Garima"));
        //sorting
        marks.stream()
                .sorted()
                .forEach(System.out::println);
        //maximum
        marks.stream().mapToInt(i->i)
                .max()
                .ifPresent(System.out::println);
        //minimum
        marks.stream()
                .mapToInt(i->i)
                .min().ifPresent(System.out::println);

        if (marks.stream().anyMatch(n -> marks.contains(90))){
            System.out.println(marks.get(0));
        }

        marks.stream().filter(n->n>50).sorted().forEach(System.out::println);
        System.out.println(" \n\n");
        marks.stream().filter(n->n>50).sorted().skip(2).forEach(System.out::println);


        //count
        long c = names.stream().count();
        System.out.println(c);

        names.stream().sorted().forEach(System.out::println);
        System.out.println("\n\n");
        //names.stream().filter(n->n==("Ishika")).skip(2).forEach(System.out::println);

        System.out.println(names.stream().distinct().count());

        //names.stream().map(String::toUpperCase).peek(e -> System.out.println("e"+e));

    }
}
