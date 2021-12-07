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
        public void areaOfRectangleWithLengthTwoAndWidthThree(){
            double answer = rectangle.areaOfRectangle(2,3);
            double expected = 6;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void areaOfRectangleWithLengthTenAndWidthEight(){
            double answer = rectangle.areaOfRectangle(10,8);
            double expected = 80;
            Assertions.assertEquals(answer, expected);
        }

        @Test
        public void areaOfRectangleWithLengthThreeAndWidthSeven(){
            double answer = rectangle.areaOfRectangle(3,7);
            double expected = 21;
            Assertions.assertEquals(answer, expected);
        }
        @Test
        public void ThrowExceptionIfLengthZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(0,10));
        }
        @Test
        public void ThrowExceptionIfWidthZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(10,0));
        }
        @Test
        public void ThrowExceptionWhenLengthAndWidthAreNegative(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(-9,-10));
        }
        @Test
        public void ThrowExceptionWhenOneValueIsNegative(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(9,-10));
        }
        @Test
        public void ThrowExceptionWhenLengthAndWidthAreSame(){
            Assertions.assertThrows(ArithmeticException.class, () -> rectangle.areaOfRectangle(10,10));
        }

    }
}
