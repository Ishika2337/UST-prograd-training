//As a statistician, I want to be able to know that the probability of a heads in a coin toss is equal
// to the probability of a tails in a coin toss.
//As a statistician, I want to be able to know the probability of two events occurring together.
//As a statistician, I want to be able to know the probability of an event not occurring.
//As a statistician, I want to be able to know the probability of either two events occurring.
public class CoinTossed {
    //p(T) = Number Of Favorable outcomes/total number of possible outcomes

    double headCount = 0;
    double tailCount = 0;
    double count = 0;
    double probability;

    String[] coinTossedOnce = {"H", "T"};
    String[] coinTossedTwice = {"HH", "TT", "HT", "TH"};

    public double tossingCoinOnce() {
        for (int i = 0; i < coinTossedOnce.length; i++) {
            if (coinTossedOnce[i] == "H") {
                headCount++;
            } else {
                tailCount++;
            }
        }
        if (headCount == tailCount) {
            count = 1;
        }
        return count;
    }

    public double occurringTwoEventsTogether() {
        for (int i = 0; i < coinTossedTwice.length; i++) {
            if (coinTossedTwice[i] == "HH") {
                headCount++;
            } else if (coinTossedTwice[i] == "TT") {
                tailCount++;
            }

        }
        probability = (headCount + tailCount) / coinTossedTwice.length;
        return probability;
    }

    public double notOccurringAnEvent() {
        return 1 - occurringTwoEventsTogether();
    }

    public double probabilityOfEitherTwoEventsOccurring() {
        for (int i = 0; i < coinTossedTwice.length; i++) {
            if (coinTossedTwice[i].contains("T") && coinTossedTwice[i].contains("H")) {
                count++;
            }
        }
        return count / coinTossedTwice.length;
    }
}
