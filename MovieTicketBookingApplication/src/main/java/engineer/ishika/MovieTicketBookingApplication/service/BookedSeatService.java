package engineer.ishika.MovieTicketBookingApplication.service;

import engineer.ishika.MovieTicketBookingApplication.entity.BookedSeats;
import engineer.ishika.MovieTicketBookingApplication.repository.BookedSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatService {
    @Autowired
    private BookedSeatRepository bookedSeatRepository;

    public BookedSeats saveSeat(BookedSeats bookedSeats){
        return bookedSeatRepository.save(bookedSeats);
    }
    public Boolean existsBySeats(String seats){
        return bookedSeatRepository.existsBySeats(seats);
    }
    public Boolean existsByMovieShowsId(Long movieShowsId){
        return bookedSeatRepository.existsByMovieShowsId(movieShowsId);
    }
    public List<BookedSeats> findByShowId(Long id){
        return bookedSeatRepository.findByMovieShowsId(id);
    }

    public BookedSeats getBySeatsAndMovieShowsId(String seats, Long id){
        return bookedSeatRepository.getBySeatsAndMovieShowsId(seats,id);
    }

    public List<BookedSeats> findByCustomerUserName(String userName){
        return bookedSeatRepository.findByCustomerUserName(userName);
    }

}
