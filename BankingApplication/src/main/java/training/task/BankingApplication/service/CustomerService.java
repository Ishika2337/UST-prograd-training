package training.task.BankingApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import training.task.BankingApplication.entity.RegisteredCustomer;
import training.task.BankingApplication.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public RegisteredCustomer createCustomer(RegisteredCustomer customer) {
        return repository.save(customer);
    }


    public List<RegisteredCustomer> customerList() {
        return repository.findAll();
    }

    public Boolean existsById(String userName){
        return repository.existsById(userName);
    }

    public RegisteredCustomer findById(String userName){
        return repository.findById(userName).get();
    }

    public RegisteredCustomer updateCustomer(RegisteredCustomer updateCustomer){
        return repository.save(updateCustomer);
    }
    public void deleteCustomer(RegisteredCustomer deleteCustomer){
        repository.delete(deleteCustomer);
    }
}
