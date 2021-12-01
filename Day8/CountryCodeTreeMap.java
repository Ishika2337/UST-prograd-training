import java.util.TreeMap;

public class CountryCodeTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> countryCode = new TreeMap<>();

        countryCode.put("India", "IN");
        countryCode.put("United States of America", "US");
        countryCode.put("China", "CN");
        countryCode.put("United Kingdom", "UK");
        countryCode.put("Russia", "RU");
        countryCode.put("Japan", "JP");
        System.out.println("Country Name and ISO Code: "+countryCode);


        String countryName = "China";
        String isoCode = countryCode.remove(countryName);
        if (isoCode != null){
            System.out.println("Removed (" + countryName + " => " + isoCode + ") from the TreeMap.\nNew TreeMap " + countryCode);
        } else {
            System.out.println(countryName + " does not exist, or it is mapped to a null value");
        }

        System.out.println("First Entry: "+ countryCode.pollFirstEntry());
        System.out.println("Last Entry: "+ countryCode.pollLastEntry());
        countryCode.clear();
        System.out.println(countryCode);
    }
}
