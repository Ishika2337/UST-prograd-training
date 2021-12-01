import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> val = new TreeMap<>(Collections.reverseOrder());
        val.put(101,"Ishika");
        val.put(102,"Garima");
        val.put(104,"Nishit");
        val.put(105,"OOOO");
        val.put(103,"Nivedita");

        for(Map.Entry<Integer,String> b: val.entrySet()){
            System.out.println(b.getKey() +"  "+ b.getValue());
        }
    }
}
