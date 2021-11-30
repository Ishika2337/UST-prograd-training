import java.util.LinkedHashSet;
import java.util.List;
class EmpName{
    int id,age;
    String name;

    public EmpName(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<EmpName> emp = new LinkedHashSet<>();
        EmpName emp1 = new EmpName(101,22,"Ishika");
        EmpName emp2 = new EmpName(102,24,"Garima");
        EmpName emp3 = new EmpName(103,21,"Nishit");
        emp.addAll(List.of(emp1,emp2,emp3));
        for(EmpName e: emp){
            System.out.println(e.id + "   " + e.age + "    " + e.name);
        }
        emp.clear();
        System.out.println(emp);

    }
}
