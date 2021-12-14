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
            double actualEvent = coinTossed.tossingCoinOnce();
            double expectedEvent = 1;
            assertEquals(expectedEvent, actualEvent);
        }
        //As a statistician, I want to be able to know the probability of two events occurring together.
        @Test
        public void checkProbabilityOfTwoEventsOccurringTogether() {
            double actualEvent = coinTossed.occurringTwoEventsTogether();
            double expectedEvent = 0.5;
            assertEquals(expectedEvent, actualEvent);
        }
        //As a statistician, I want to be able to know the probability of an event not occurring.
        @Test
        public void checkProbabilityOfTwoEventsNotOccurringTogether() {
            assertEquals(0.5, coinTossed.notOccurringAnEvent());
        }
        //As a statistician, I want to be able to know the probability of either two events occurring.
        @Test
        public void checkProbabilityEitherOccurringTogether() {
            assertEquals(0.5, coinTossed.probabilityOfEitherTwoEventsOccurring());
        }
    }


}