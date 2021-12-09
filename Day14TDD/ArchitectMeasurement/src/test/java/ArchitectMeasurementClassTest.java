import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectMeasurementClassTest {
    @Nested
    public class CheckConversionEquality{
        ArchitectMeasurementClass architectMeasurementClass;
        @Test
        public void checkOneMeterIsEqualToHundredCentimeter () {
        architectMeasurementClass = new ArchitectMeasurementClass(1);
        double ans = architectMeasurementClass.meterToCentimeter();
        double expected = 100;
        assertEquals(expected, ans);
    }
        @Test
        public void checkHundredCentimeterIsEqualToZeroPointZeroZeroOneKilometer () {
        architectMeasurementClass = new ArchitectMeasurementClass(100);
        double ans = architectMeasurementClass.CentimeterToKilometer();
        double expected = 0.001;
        assertEquals(expected, ans);
    }
        @Test
        public void checkOneCentimeterIsEqualToOneCentimeter () {
        architectMeasurementClass = new ArchitectMeasurementClass(1);
        double ans = architectMeasurementClass.CentimeterToCentimeter();
        double expected = 1;
        assertEquals(expected, ans);
    }
        @Test
        public void throwExceptionIfValueIsZero () {
        assertThrows(IllegalArgumentException.class, () -> new ArchitectMeasurementClass(0));
    }
        @Test
        public void throwExceptionIfValueIsNegativeFour () {
        assertThrows(IllegalArgumentException.class, () -> new ArchitectMeasurementClass(-4));
    }
    }

    @Nested
    public class OperationOnConversion{
        ArchitectMeasurementClass architectMeasurementClass;
        @Test
        public void checkOneMeterPlusHundredCentimeterIsTwoMeter(){
            architectMeasurementClass = new ArchitectMeasurementClass(1,100);
            double answer = architectMeasurementClass.additionMeterAndCentimeterGivesMeter();
            double expected = 2;
            assertEquals(expected,answer);
        }
        @Test
        public void checkTwoHundredCentimeterPlusOneKilometerIsOneLackTwoHundredCentimeter(){
            architectMeasurementClass = new ArchitectMeasurementClass(200,1);
            double answer = architectMeasurementClass.additionCentimeterAndKilometerGivesCentimeter();
            double expected = 100200;
            assertEquals(expected,answer);
        }
        @Test
        public void checkSubtractionOfOneMeterAndFiftyCentimeterIsZeroPointFiveMeter(){
            architectMeasurementClass = new ArchitectMeasurementClass(1,50);
            double answer = architectMeasurementClass.subtractMeterAndCentimeterGivesMeter();
            double expected = 0.5;
            assertEquals(expected,answer);
        }
        @Test
        public void checkSubtractionOfTwoThousandAndOneMeterIsNineteenHundredCentimeter(){
            architectMeasurementClass = new ArchitectMeasurementClass(2000,1);
            double answer = architectMeasurementClass.subtractCentimeterAndMeterGivesCentimeter();
            double expected = 1900;
            assertEquals(expected,answer);
        }
    }
}