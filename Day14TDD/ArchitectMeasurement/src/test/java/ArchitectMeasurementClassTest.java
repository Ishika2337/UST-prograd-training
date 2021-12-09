import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchitectMeasurementClassTest {
    ArchitectMeasurementClass m ;
    @Test
    public void checkOneMeterIsEqualToHundredCentimeter(){
        m = new ArchitectMeasurementClass(1);
        double ans = m.meterToCentimeter();
        double expected = 100;
        assertEquals(expected, ans);
    }
    @Test
    public void checkHundredCentimeterIsEqualToZeroPointZeroZeroOneKilometer(){
        m = new ArchitectMeasurementClass(100);
        double ans = m.CentimeterToKilometer();
        double expected = 0.001;
        assertEquals(expected, ans);
    }
    @Test
    public void checkOneCentimeterIsEqualToOneCentimeter(){
        m = new ArchitectMeasurementClass(1);
        double ans = m.CentimeterToCentimeter();
        double expected = 1;
        assertEquals(expected, ans);
    }
    @Test
    public void throwExceptionIfValueIsZero(){
        assertThrows(IllegalArgumentException.class, () -> new ArchitectMeasurementClass(0));
    }
    @Test
    public void throwExceptionIfValueIsNegativeFour(){
        assertThrows(IllegalArgumentException.class, () -> new ArchitectMeasurementClass(-4));
    }
}