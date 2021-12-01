import java.util.*;
public class Dictionary {
    HashMap<String,String> dict;
    public Dictionary(){
        dict = new HashMap();
    }

    public void newEntry(String key, String value){
        dict.put(key,value);
    }

    public String look(String key){
        return dict.getOrDefault(key, "Cant find entry for " + key);
    }
}
