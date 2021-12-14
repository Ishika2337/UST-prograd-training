public class WeightConvertor extends MagnitudeConvertor {
    public double gramToGram(double weightInGram) {
        return baseToBase(weightInGram);
    }

    public double kilogramToGram(double weightInKilogram) {
        return kiloToBase(weightInKilogram);
    }

    public double gramToKilogram(double weightInGram) {
        return baseToKilo(weightInGram);
    }
}
