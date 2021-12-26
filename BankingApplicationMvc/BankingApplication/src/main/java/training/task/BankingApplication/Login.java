package training.task.BankingApplication;

import org.springframework.stereotype.Component;

import java.util.TreeMap;

@Component
public class Login {
    public void loginDetails(){
        TreeMap<String,String> login = new TreeMap<>();
        login.put("Ishika", "Ishika@");
        login.put("Gaurav", "Gaurav@");
    }

}
