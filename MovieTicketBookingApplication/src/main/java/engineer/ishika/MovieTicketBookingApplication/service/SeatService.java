package engineer.ishika.MovieTicketBookingApplication.service;

import engineer.ishika.MovieTicketBookingApplication.entity.Seats;
import engineer.ishika.MovieTicketBookingApplication.repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatsRepository seatsRepository;

    public Seats getBySeats(String seats){
        return seatsRepository.getBySeats(seats);
    }
}
