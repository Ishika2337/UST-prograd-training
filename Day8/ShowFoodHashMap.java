import java.util.HashMap;
import java.util.Map;

class Food {
    String foodName;
    String foodType;

    public Food(String foodName, String foodType) {
        this.foodName = foodName;
        this.foodType = foodType;
    }
}

public class ShowFoodHashMap {
    public static void main(String[] args) {
        Map<Integer,Food> dish = new HashMap<>();
        Food f1 = new Food("Pasta","Italian");
        Food f2 = new Food("Chow mein","Chinese");
        Food f3 = new Food("Dal Baati","Rajasthani");
        Food f4 = new Food("Dosa","South Indian");

        dish.put(1,f1);
        dish.put(2,f2);
        dish.put(3,f3);
        System.out.println("Menu");
        for(Map.Entry<Integer,Food> dishes: dish.entrySet()){
            Food f = dishes.getValue();
            System.out.println(dishes.getKey()+ "   " + f.foodName + "   --->   " + f.foodType);
        }

        dish.putIfAbsent(4,f4);
        System.out.println("Updated Menu");
        for(Map.Entry<Integer,Food> dishes: dish.entrySet()){
            Food f = dishes.getValue();
            System.out.println(dishes.getKey()+ "   " + f.foodName + "   --->   " + f.foodType);
        }

    }
}