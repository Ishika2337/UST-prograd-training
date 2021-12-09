public class Rectangle {
    double length;
    double width;

    public Rectangle() {
        this.length = 0.0;
        this.width = 0.0;
    }

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Values Can't be zero and Negative");
        }
//        if (length == width) {
//            throw new IllegalArgumentException("Values should not be same in rectangle");
//        }
        this.length = length;
        this.width = width;

    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}
