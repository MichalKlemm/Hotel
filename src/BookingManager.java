import com.engeto.ja.hotel.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private int getNumberOfWorkingBookings;

    private final List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    public void removeBooking(Booking booking){
        bookings.remove(booking);
    }
    public void clearBookings(Booking booking){
        bookings.clear();
    }
    public List<Booking> getBookings(){
        return new ArrayList<>(bookings);
    }
}
