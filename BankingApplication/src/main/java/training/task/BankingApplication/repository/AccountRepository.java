package training.task.BankingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import training.task.BankingApplication.entity.Account;

public interface AccountRepository extends JpaRepository<Account,String> {
}
