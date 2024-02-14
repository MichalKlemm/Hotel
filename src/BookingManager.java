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

    public void printAllBookings(){
        for (Booking booking : bookings){
            System.out.println(booking);;
        }
    }

    public void printFirstRecreationalBookings(int n){
        int count = 0;
        for (Booking booking : bookings){
            if (!booking.getTypeOfVacation()){
                System.out.println(booking);
                count++;
            }
            if (count == n){
                break;
            }
        }
    }

    public void printGuestStatistics(){
        int singleGuest = 0;
        int doubleGuest = 0;
        int multipleGuest = 0;

        for (Booking booking : bookings){
            int guestCount = booking.getGuests().size();
            if (guestCount == 1) {
                singleGuest++;
            }else if (guestCount == 2){
                    doubleGuest++;
                    }else {
                        multipleGuest++;
                    }
                }
                System.out.println("Celkový počet rezervací s jedním hostem: " + singleGuest);
                System.out.println("Celkový počet rezervací se dvěma hosty: " + doubleGuest);
                System.out.println("Celkový počet rezervací s více než dvěma hosty: " + multipleGuest);
            }
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
