package engineer.ishika.MovieTicketBookingApplication.repository;

import engineer.ishika.MovieTicketBookingApplication.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
