package engineer.ishika.MovieTicketBookingApplication.repository;

import engineer.ishika.MovieTicketBookingApplication.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats, Long> {
    public Seats getBySeats(String seats);
}
