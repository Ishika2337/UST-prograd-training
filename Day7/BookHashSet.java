import java.util.HashSet;
import java.util.List;

class Books{
    int id;
    String name, publisher;

    public Books(int id, String name, String publisher) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
    }
}
public class BookHashSet {
    public static void main(String[] args) {
        HashSet<Books> bookSet = new HashSet();
        Books b1 = new Books(1,"Something I never told you","Shravya Bhinder");
        Books b2 = new Books(2,"A Girl To Remember","Ajay k. Pandey");
        Books b3 = new Books(3,"Her Last Wish","Ajay k. Pandey");
        bookSet.addAll(List.of(b1,b2,b3));
        for(Books b: bookSet){
            System.out.println(b.id + "   " + b.name + "       " + b.publisher);
        }
        System.out.println("Books Counting: "+ bookSet.size());
        bookSet.removeAll(bookSet);
        System.out.println(bookSet.isEmpty());
    }
}
