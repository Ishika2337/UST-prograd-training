public class Rectangle {
    public double areaOfRectangle(double length, double width){
        if (length<=0 || width<=0){
            throw new ArithmeticException("Values Can't be zero and Negative");
        }
        if (length==width){
            throw new ArithmeticException("Values should not be same in rectangle");
        }
        return length*width;
    }
}
