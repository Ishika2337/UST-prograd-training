import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTossedTest {

    CoinTossed coinTossed = new CoinTossed();

    @Nested
    public class ProbabilityEvents {
        /*As a statistician, I want to be able to know that the probability of a heads in a coin toss is equal
            to the probability of a tails in a coin toss.*/
        @Test
        public void checkProbabilityOfHeadsIsEqualsToTails() {
            assertEquals(1, coinTossed.tossingCoinOnce());
        }
        //As a statistician, I want to be able to know the probability of two events occurring together.
        @Test
        public void checkProbabilityOfTwoEventsOccurringTogether() {
            assertEquals(0.5, coinTossed.occurringTwoEventsTogether());
        }
        //As a statistician, I want to be able to know the probability of either two events occurring.
        @Test
        public void checkProbabilityEitherTwoEventsOccurringTogether() {
            assertEquals(0.5, coinTossed.probabilityOfEitherTwoEventsOccurring());
        }
    }
    @Nested
    public class ProbabilityOfNotOccurringAnEvent{
        //As a statistician, I want to be able to know the probability of an event not occurring.
        @Test
        public void checkProbabilityOfAnEventHHIsNotOccurred() {
            assertEquals(0.25, coinTossed.notOccurringAnEvent("HH"));
        }
        @Test
        public void checkProbabilityOfAnEventTHIsNotOccurred() {
            assertEquals(0.25, coinTossed.notOccurringAnEvent("TH"));
        }
        @Test
        public void giveExceptionWhenEventIsNotValid(){
            assertThrows(IllegalArgumentException.class,()-> coinTossed.notOccurringAnEvent("th"));
        }
    }


}