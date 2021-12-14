public class LengthConvertor extends MagnitudeConvertor {
    public double meterToCentimeter(double lengthInMeter) {
        return baseToCenti(lengthInMeter);
    }

    public double CentimeterToKilometer(double lengthInCentimeter) {
        return centiToKilo(lengthInCentimeter);
    }

    public double CentimeterToCentimeter(double lengthInCentimeter) {
        return baseToBase(lengthInCentimeter);
    }

    public double centimeterToMeter(double lengthInCentimeter) {
        return centiToBase(lengthInCentimeter);
    }

    public double kilometerToCentimeter(double lengthInKilometer) {
        return kiloToCenti(lengthInKilometer);
    }
}

