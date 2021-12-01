import java.util.LinkedHashMap;

public class EmpIdNameLinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> empIdName = new LinkedHashMap<>();
        empIdName.put(101, "Nishit");
        empIdName.put(102, "David");
        empIdName.put(103, "Pankaj");
        empIdName.put(104, "Ishika");
        empIdName.put(105, "Himanshu");
        System.out.println("Employ Id and Name: "+ empIdName);

        // Check if a key exists in the LinkedHashMap
        int id = 105;
        if(empIdName.containsKey(id)){
            System.out.println("Found the customer with id " + id + " : " + empIdName.get(id));
        } else {
            System.out.println("Customer with id " + id + " does not exist");
        }

        // Check if a value exists in the LinkedHashMap
        String name = "Ishika";
        if(empIdName.containsValue(name)) {
            System.out.println("A customer named " + name + " exist in the map");
        } else {
            System.out.println("No customer found with name " + name + " in the map");
        }

        id = 104;
        empIdName.put(id, "Garima");
        System.out.println("Changed the name of customer with id " + id + ", New mapping : " + empIdName.get(id));

    }
}
