public class ArchitectMeasurementClass {
    public double value;
    public double magnitude1;
    public double magnitude2;
    public ArchitectMeasurementClass(double value){
        if (value<=0){
            throw new IllegalArgumentException("Value can't be zero or less than zero");
        }
        this.value = value;
    }
    public ArchitectMeasurementClass(double magnitude1,double magnitude2){
//        if (value<=0){
//            throw new IllegalArgumentException("Value can't be zero or less than zero");
//        }
        this.magnitude1 = magnitude1;
        this.magnitude2 = magnitude2;
    }
    public double meterToCentimeter(){
        return value*100;
    }
    public double CentimeterToKilometer(){
        return value/100000;
    }
    public double CentimeterToCentimeter(){
        return value;
    }
    public double centimeterToMeter(){
        return value/100;
    }
    public double additionMeterAndCentimeterGivesMeter(){
        return magnitude1 + (magnitude2/100);
    }
    public double additionCentimeterAndKilometerGivesCentimeter(){
        return magnitude1 + (magnitude2*100000);
    }

    public double subtractMeterAndCentimeterGivesMeter() {
        return magnitude1 - (magnitude2/100);
    }
    public double subtractCentimeterAndMeterGivesCentimeter() {
        return magnitude1 - (magnitude2*100);
    }
}

