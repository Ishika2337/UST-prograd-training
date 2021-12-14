public class MagnitudeConvertor {
    public double baseToBase(double magnitudeInBase) {
        return magnitudeInBase;
    }

    // Kilometer to meter
    // Kilogram to Gram
    public double kiloToBase(double magnitudeInKilo) {
        return magnitudeInKilo * 1000;
    }

    // Meter to Kilometer
    // Gram to Kilogram
    public double baseToKilo(double magnitudeInBase) {
        return magnitudeInBase / 1000;
    }

    // Centimeter to Meter
    // Centigram to Gram
    public double centiToBase(double magnitudeInCenti) {
        return magnitudeInCenti / 100;
    }

    // Meter to Centimeter
    // Gram to Centigram
    public double baseToCenti(double magnitudeInBase) {
        return magnitudeInBase * 100;
    }

    // Centimeter to Kilometer
    // Centigram to Kilogram
    public double centiToKilo(double magnitudeInCenti) {
        return magnitudeInCenti / 100000;
    }

    // Kilometer to Centimeter
    // Kilogram to Centigram
    public double kiloToCenti(double magnitudeInKilo) {
        return magnitudeInKilo * 100000;
    }

}

