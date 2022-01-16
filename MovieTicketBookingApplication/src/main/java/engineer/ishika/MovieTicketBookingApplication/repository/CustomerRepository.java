package engineer.ishika.MovieTicketBookingApplication.repository;

import engineer.ishika.MovieTicketBookingApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
