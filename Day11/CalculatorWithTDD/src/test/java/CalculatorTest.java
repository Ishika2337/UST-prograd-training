import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;
    @Nested
    class AdditionOfTwoNumbers{
        @BeforeEach
        public void getObject(){
            calc = new Calculator();
        }
        @Test
        public void addOfTwoAndEightIsTen(){
            double answer = calc.addition(2,8);
            double expected = 10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void addOfFiveAndNegTwoIsThree(){
            double answer = calc.addition(5,-2);
            double expected = 3;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void addOfTwoAndZeroIsTwo(){
            double answer = calc.addition(2,0);
            double expected = 2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void addOfNegFiveAndNegTwoIsNegSeven(){
            double answer = calc.addition(-5,-2);
            double expected = -7;
            Assertions.assertEquals(answer,expected);
        }
    }

    @Nested
    class SubtractionOfTwoNumbers{
        @BeforeEach
        public void getObject(){
            calc = new Calculator();
        }
        @Test
        public void subOfEightAndTwoIsSix(){
            double answer = calc.subtraction(8,2);
            double expected = 6;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void subOfFiveAndNegTwoIsSeven(){
            double answer = calc.subtraction(5,-2);
            double expected = 7;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void subOfTwoAndZeroIsTwo(){
            double answer = calc.subtraction(2,0);
            double expected = 2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void subOfNegFiveAndNegTwoIsNegThree(){
            double answer = calc.subtraction(-5,-2);
            double expected = -3;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void subOfFiveAndTenIsNegFive(){
            double answer = calc.subtraction(5,10);
            double expected = -5;
            Assertions.assertEquals(answer,expected);
        }
    }


    @Nested
    class MultiplicationOfTwoNumbers{
        @BeforeEach
        public void getObject(){
            calc = new Calculator();
        }
        @Test
        public void mulOfTwoAndEightIsSixteen(){
            double answer = calc.multiplication(2,8);
            double expected = 16;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void mulOfFiveAndNegTwoIsNegTen(){
            double answer = calc.multiplication(5,-2);
            double expected = -10;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void mulOfTwoAndZeroIsZero(){
            double answer = calc.multiplication(2,0);
            double expected = 0;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void mulOfNegFiveAndNegTwoIsTen(){
            double answer = calc.multiplication(-5,-2);
            double expected = 10;
            Assertions.assertEquals(answer,expected);
        }
    }
    @Nested
    public class DivisionOfTwoNumbers{
        @BeforeEach
        public void getObject(){
            calc = new Calculator();
        }
        @Test
        public void divOfTenAndTwoIsFive(){
            double answer = calc.division(10,2);
            double expected = 5;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void ThrowExceptionWhenDivideByZero(){
            Assertions.assertThrows(ArithmeticException.class, () -> calc.division(10,0) );
        }
        @Test
        public void divOfFiveAndTenIsPointFive(){
            double answer = calc.division(5,10);
            double expected = 0.5;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void divOfNegTenAndNegFiveIsTwo(){
            double answer = calc.division(-10,-5);
            double expected = 2;
            Assertions.assertEquals(answer,expected);
        }
        @Test
        public void divOfNegTenAndFiveIsTwo(){
            double answer = calc.division(-10,5);
            double expected = -2;
            Assertions.assertEquals(answer,expected);
        }
    }


}
