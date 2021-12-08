import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Nested
    public class TestAreaOfSquare {
        Square square;

        @Test
        public void areaOfSquareWithSideTwoIsFour() {
            square = new Square(2, 2);
            double answer = square.areaOfRectangle();
            double expected = 4;
            Assertions.assertEquals(expected, answer);
        }

        @Test
        public void areaOfSquareWithSideFiveIsTwentyFive() {
            square = new Square(5,5);
            double answer = square.areaOfRectangle();
            double expected = 25;
            Assertions.assertEquals(expected, answer);
        }

        @Test
        public void areaOfSquareThrowExceptionIfSide1IsThreeAndSide2IsTwo() {
            assertThrows(IllegalArgumentException.class, () -> new Square(3, 2));
        }
        @Test
        public void areaOfSquareThrowExceptionIfSide1IsNegativeFourAndSide2IsSix() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-4, 6));
        }
        @Test
        public void areaOfSquareThrowExceptionIfSide1IsNegativeSixAndSide2IsNegativeTwo() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-6, -2));
        }
        @Test
        public void areaOfSquareThrowExceptionIfSideIsZero() {
            assertThrows(IllegalArgumentException.class, () -> new Square(0, 0));
        }

    }


    @Nested
    public class TestPerimeterOfSquare {
        Square square;

        @Test
        public void perimeterOfSquareWithSideThreeIsTwelve() {
            square = new Square(3, 3);
            double answer = square.perimeterOfRectangle();
            double expected = 12;
            Assertions.assertEquals(expected, answer);
        }

        @Test
        public void perimeterOfSquareWithSideSixIsTwentyFour() {
            square = new Square(6,6);
            double answer = square.perimeterOfRectangle();
            double expected = 24;
            Assertions.assertEquals(expected, answer);
        }

        @Test
        public void perimeterOfSquareThrowExceptionIfSide1IsSevenAndSide2IsTwo() {
            assertThrows(IllegalArgumentException.class, () -> new Square(7, 2));
        }
        @Test
        public void perimeterOfSquareThrowExceptionIfSide1IsNegativeTwoAndSide2IsSix() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-2, 6));
        }
        @Test
        public void perimeterOfSquareThrowExceptionIfSide1IsNegativeSixAndSide2IsNegativeEight() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-6, -8));
        }
        @Test
        public void perimeterOfSquareThrowExceptionIfSideIsZero() {
            assertThrows(IllegalArgumentException.class, () -> new Square(0, 0));
        }

    }

}