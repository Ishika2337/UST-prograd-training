package training.task.BankingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.task.BankingApplication.entity.RegisteredCustomer;

public interface CustomerRepository extends JpaRepository<RegisteredCustomer,String> {
   // public Boolean findByCustomerNameAndPassword(String name, String password);
}
