import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @Nested
    public class AreaOfRectangle{
        @BeforeEach
        public void setRectangle(){
            rectangle = new Rectangle();
        }

        @Test
        public void areaOfRectangleWithLengthTwoAndWidthThreeIsSix(){
            double answer = rectangle.areaOfRectangle(2,3);
            double expected = 6;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void areaOfRectangleWithLengthTenAndWidthEightIsEighty(){
            double answer = rectangle.areaOfRectangle(10,8);
            double expected = 80;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleWithLengthThreeAndWidthSevenIsTwentyOne(){
            double answer = rectangle.areaOfRectangle(3,7);
            double expected = 21;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void areaOfRectangleWithLengthThreePointFiveAndWidthTwoPointSixIsNinePointOne(){
            double answer = rectangle.areaOfRectangle(3.5,2.6);
            double expected = 9.1;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void areaThrowExceptionIfLengthZeroAndWidthTen(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(0,10));
        }
        @Test
        public void areaThrowExceptionIfWidthZeroAndLengthTen(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(10,0));
        }
        @Test
        public void areaThrowExceptionWhenLengthIsNegativeNineAndWidthIsNegativeTen(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(-9,-10));
        }
        @Test
        public void areaThrowExceptionIfLengthIsNineAndWidthIsNegativeTen(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(9,-10));
        }
        @Test
        public void areaThrowExceptionWhenLengthTenAndWidthTen(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(10,10));
        }

    }

    @Nested
    public class perimeterOfRectangle {
        @BeforeEach
        public void setRectangle() {
            rectangle = new Rectangle();
        }

        @Test
        public void perimeterOfRectangleWithLengthFiveAndWidthTwoIsFourteen(){
            double answer = rectangle.perimeterOfRectangle(5,2);
            double expected = 14;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void perimeterOfRectangleWithLengthSixAndWidthThreeIsEighteen(){
            double answer = rectangle.perimeterOfRectangle(6,3);
            double expected = 18;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void perimeterOfRectangleWithLengthNinePointOneAndWidthSevenIsThirtyTwoPointTwo(){
            double answer = rectangle.perimeterOfRectangle(9.1,7);
            double expected = 32.2;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void perimeterOfRectangleWithLengthTwoPointFiveAndWidthFivePointFiveIsSixteen(){
            double answer = rectangle.perimeterOfRectangle(2.5,5.5);
            double expected = 16;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void perimeterThrowExceptionIfLengthZeroAndWidthTwelve(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.perimeterOfRectangle(0,12));
        }

        @Test
        public void perimeterThrowExceptionIfLengthZeroAndWidthZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.perimeterOfRectangle(0,0));
        }
        @Test
        public void perimeterThrowExceptionWhenLengthIsNegativeNineAndWidthIsNegativeOne(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.perimeterOfRectangle(-9,-1));
        }
        @Test
        public void perimeterThrowExceptionIfLengthIsNegativeNineAndWidthIsTen(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.perimeterOfRectangle(-9,10));
        }
        @Test
        public void perimeterThrowExceptionWhenLengthSixAndWidthSix(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.perimeterOfRectangle(6,6));
        }
    }
}
