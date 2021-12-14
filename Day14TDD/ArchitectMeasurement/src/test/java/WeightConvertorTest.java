import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class WeightConvertorTest {
    WeightConvertor weightConvertor = new WeightConvertor();

    @Nested
    public class GramToGram {
        @Test
        public void checkIfOneGramIsEqualToOneGram() {
            double actualWeight = weightConvertor.gramToGram(1);
            double expectedWeight = 1;
            assertEquals(expectedWeight, actualWeight);
        }

    }

    @Nested
    public class kilogramToGram {
        @Test
        public void checkIfZeroPointOneKilogramIsEqualToHundredGram() {
            double actualWeight = weightConvertor.kilogramToGram(0.1);
            double expectedWeight = 100;
            assertEquals(expectedWeight, actualWeight);
        }

    }

    @Nested
    public class AdditionOfWeight {
        @Test
        public void additionOfTenGramAndOneKilogramIsEqualToOneThousandTen() {
            double actualWeight = 10 + weightConvertor.kilogramToGram(1);
            double expectedWeight = 1010;
            assertEquals(expectedWeight, actualWeight);
        }

    }

    @Nested
    public class SubtractionOfWeight {
        @Test
        public void subtractionOfOneAndAHalfKilogramAndFiveHundredGramIsEqualToOneKilogram() {
            double actualWeight = 1.5 - weightConvertor.gramToKilogram(500);
            double expectedWeight = 1;
            assertEquals(expectedWeight, actualWeight);
        }

    }

}