public class ArchitectMeasurementClass {
    public double value;
    public ArchitectMeasurementClass(double value){
        if (value<=0){
            throw new IllegalArgumentException("Value can't be zero or less than zero");
        }
        this.value = value;
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
}
