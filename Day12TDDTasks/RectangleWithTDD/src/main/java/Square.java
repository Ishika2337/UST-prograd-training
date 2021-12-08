public class Square extends Rectangle {
    Rectangle rectangle = new Rectangle();

    public Square(double side1, double side2) {
        super(side1, side2);
        if (side1 != side2) {
            throw new IllegalArgumentException("Values Can't same in Square");
        }
        this.length = side1;
        this.width = side2;
        rectangle.areaOfRectangle();
        rectangle.perimeterOfRectangle();

    }
}
