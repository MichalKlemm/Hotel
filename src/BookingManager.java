import com.engeto.ja.hotel.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private final List<Booking> bookings; //= new ArrayList<>();

    public BookingManager(List<Booking> bookings){
        this.bookings = new ArrayList<>(bookings);
    }

    public void addBooking(Booking newBooking){
        bookings.add(newBooking);
    }
    public void removeBooking(Booking booking){
        bookings.remove(booking);
    }
    public void clearBookings(){
        bookings.clear();
    }
    public List<Booking> getBookings(){
        return new ArrayList<>(bookings);
    }

    public int getNumberOfWorkingBookings(){
        int workingBookings = 0;
        for (Booking booking : bookings){
            if (booking.getTypeOfVacation()){
                workingBookings++;
            }
        }
        return workingBookings;
    }

    public int getNumberOfRecreationalBookings(){
        int recreationalBookings = 0;
        for (Booking booking : bookings){
        if (!booking.getTypeOfVacation()) {
            recreationalBookings++;
            }
        }
        return recreationalBookings;
    }

    public double getAverageGuests(){
        if (bookings.isEmpty()){
            return 0.0;
        }

        int totalGuests = 0;
        for (Booking booking : bookings){
            totalGuests += booking.getNumberOfGuests();
        }
        return (double) totalGuests / bookings.size();
    }

}
