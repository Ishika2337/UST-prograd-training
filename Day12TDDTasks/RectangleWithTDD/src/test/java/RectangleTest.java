import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @Nested
    public class AreaOfRectangle{
        Rectangle rectangle;

        @Test
        public void areaOfRectangleWithLengthTwoAndWidthThreeIsSix(){
            rectangle = new Rectangle(2,3);
            double answer = rectangle.areaOfRectangle();
            double expected = 6;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void areaOfRectangleWithLengthTenAndWidthEightIsEighty(){
            rectangle = new Rectangle(10, 8);
            double answer = rectangle.areaOfRectangle();
            double expected = 80;
            Assertions.assertEquals(expected, answer);
        }

        @Test
        public void areaOfRectangleWithLengthThreeAndWidthSevenIsTwentyOne(){
            rectangle = new Rectangle(3,7);
            double answer = rectangle.areaOfRectangle();
            double expected = 21;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void areaOfRectangleWithLengthThreePointFiveAndWidthTwoPointSixIsNinePointOne(){
            rectangle = new Rectangle(3.5,2.6);
            double answer = rectangle.areaOfRectangle();
            double expected = 9.1;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void areaThrowExceptionIfLengthZeroAndWidthTen(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,10));
        }
        @Test
        public void areaThrowExceptionIfWidthZeroAndLengthTen(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(10,0));
        }
        @Test
        public void areaThrowExceptionWhenLengthIsNegativeNineAndWidthIsNegativeTen(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> rectangle = new Rectangle(-9,-10));
        }
        @Test
        public void areaThrowExceptionIfLengthIsNineAndWidthIsNegativeTen(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(9,-10));

        }
        @Test
        public void areaThrowExceptionWhenLengthTenAndWidthTen(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(10,10));
        }

    }

    @Nested
    public class perimeterOfRectangle {
        Rectangle rectangle;

        @Test
        public void perimeterOfRectangleWithLengthFiveAndWidthTwoIsFourteen(){
            rectangle = new Rectangle(5,2);
            double answer = rectangle.perimeterOfRectangle();
            double expected = 14;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void perimeterOfRectangleWithLengthSixAndWidthThreeIsEighteen(){
            rectangle = new Rectangle(6,3);
            double answer = rectangle.perimeterOfRectangle();
            double expected = 18;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void perimeterOfRectangleWithLengthNinePointOneAndWidthSevenIsThirtyTwoPointTwo(){
            rectangle = new Rectangle(9.1,7);
            double answer = rectangle.perimeterOfRectangle();
            double expected = 32.2;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void perimeterOfRectangleWithLengthTwoPointFiveAndWidthFivePointFiveIsSixteen(){
            rectangle = new Rectangle(2.5,5.5);
            double answer = rectangle.perimeterOfRectangle();
            double expected = 16;
            Assertions.assertEquals(expected, answer);
        }
        @Test
        public void perimeterThrowExceptionIfLengthZeroAndWidthTwelve(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,12));
        }

        @Test
        public void perimeterThrowExceptionIfLengthZeroAndWidthZero(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(0,0));
        }
        @Test
        public void perimeterThrowExceptionWhenLengthIsNegativeNineAndWidthIsNegativeOne(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-9,-1));
        }
        @Test
        public void perimeterThrowExceptionIfLengthIsNegativeNineAndWidthIsTen(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-9,10));
        }
        @Test
        public void perimeterThrowExceptionWhenLengthSixAndWidthSix(){
            Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(6,6));
        }
    }
}
