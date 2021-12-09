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
            square = new Square(2);
            double answer = square.area();
            double expected = 4;
            assertEquals(expected, answer);
        }

        @Test
        public void areaOfSquareWithSideFiveIsTwentyFive() {
            square = new Square(5);
            double answer = square.area();
            double expected = 25;
            assertEquals(expected, answer);
        }


        @Test
        public void areaOfSquareThrowExceptionIfSideIsNegativeFour() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-4));
        }
        @Test
        public void areaOfSquareThrowExceptionIfSideIsNegativeSix() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-6));
        }
        @Test
        public void areaOfSquareThrowExceptionIfSideIsZero() {
            assertThrows(IllegalArgumentException.class, () -> new Square(0));
        }

    }


    @Nested
    public class TestPerimeterOfSquare {
        Square square;

        @Test
        public void perimeterOfSquareWithSideThreeIsTwelve() {
            square = new Square(3);
            double answer = square.perimeter();
            double expected = 12;
            assertEquals(expected, answer);
        }

        @Test
        public void perimeterOfSquareWithSideSixIsTwentyFour() {
            square = new Square(6);
            double answer = square.perimeter();
            double expected = 24;
            assertEquals(expected, answer);
        }

        @Test
        public void perimeterOfSquareThrowExceptionIfSideIsNegativeTwo() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-2));
        }
        @Test
        public void perimeterOfSquareThrowExceptionIfSideIsNegativeEight() {
            assertThrows(IllegalArgumentException.class, () -> new Square(-8));
        }
        @Test
        public void perimeterOfSquareThrowExceptionIfSideIsZero() {
            assertThrows(IllegalArgumentException.class, () -> new Square(0));
        }

    }

}