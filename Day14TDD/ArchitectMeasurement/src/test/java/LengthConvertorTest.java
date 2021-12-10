import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConvertorTest {
    LengthConvertor lengthConvertor = new LengthConvertor();

    @Nested
    public class MeterToCentimeter {

        @Test
        public void checkOneMeterIsEqualToHundredCentimeter() {
            double answer = lengthConvertor.meterToCentimeter(1);
            double expected = 100;
            assertEquals(expected, answer);
        }
    }

    @Nested
    public class CentimeterToKilometer {

        @Test
        public void checkHundredCentimeterIsEqualToZeroPointZeroZeroOneKilometer() {
            double answer = lengthConvertor.CentimeterToKilometer(100);
            double expected = 0.001;
            assertEquals(expected, answer);
        }
    }

    @Nested
    public class CentimeterToCentimeter {

        @Test
        public void checkOneCentimeterIsEqualToOneCentimeter() {
            double answer = lengthConvertor.CentimeterToCentimeter(1);
            double expected = 1;
            assertEquals(expected, answer);
        }
    }

    @Nested
    public class AdditionOfLength {
        @Test
        public void checkAdditionOfOneMeterAndHundredCentimeterIsTwoMeter() {
            double answer = 1 + lengthConvertor.centimeterToMeter(100);
            double expected = 2;
            assertEquals(expected, answer);
        }

        @Test
        public void checkTwoHundredCentimeterPlusOneKilometerIsOneLackTwoHundredCentimeter() {
            double answer = 200 + lengthConvertor.kilometerToCentimeter(1);
            double expected = 100200;
            assertEquals(expected, answer);
        }
    }

    @Nested
    public class SubtractionOfLength {

        @Test
        public void checkSubtractionOfOneMeterAndFiftyCentimeterIsZeroPointFiveMeter() {
            double answer = 1 - lengthConvertor.centimeterToMeter(50);
            double expected = 0.5;
            assertEquals(expected, answer);
        }

        @Test
        public void checkSubtractionOfTwoThousandAndOneMeterIsNineteenHundredCentimeter() {
            double answer = 2000 - lengthConvertor.meterToCentimeter(1);
            double expected = 1900;
            assertEquals(expected, answer);
        }
    }
}
