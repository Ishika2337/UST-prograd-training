import java.util.List;
import java.util.Stack;

public class VehicleStack {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<>();
        cars.push("BMW");
        cars.addAll(List.of("Creta", "Audi", "Honda"));
        System.out.println("Cars Name");
        cars.forEach(carName -> System.out.print(carName +"    "));

        System.out.println("\n last car in showroom" + cars.peek());
        System.out.println("Some client buy Creta");
        if(cars.contains("Creta")){
            cars.pop();
        }
        System.out.println(cars);
    }
}
