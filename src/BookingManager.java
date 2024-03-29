import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.Guest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (Booking booking : bookings) {
            LocalDate startDate = booking.getArrivaldate();
            LocalDate endDate = booking.getDeparturedate();
            List<Guest> guests = booking.getGuests();
            boolean hasSeaView = booking.hasSeaView();
            BigDecimal price = booking.getPrice();

            String formattedStartDate = startDate.format(dateFormatter);
            String formattedEndDate = endDate.format(dateFormatter);
            if (!guests.isEmpty()){
            String guestName = guests.get(0).getName();
            LocalDate guestBirthdate = guests.get(0).getBirthdate();
            int numberOfGuests = guests.size();
            String seaView = hasSeaView ? "ano," : "ne,";

            // Výpis rezervace ve formátu
            System.out.println(formattedStartDate + " až " + formattedEndDate + ": " +
                    guestName + " (" + guestBirthdate + ")" +
                    " poč. hostů: " + numberOfGuests + ", výhled na moře: " + seaView + " za " + price + " Kč");
        } else {
                String seaView = hasSeaView ? "ano," : "ne,";
                System.out.println(formattedStartDate + " až " + formattedEndDate + ": " + "Bez hostů, výhled na moře: " +
                        seaView + " za " + price + " Kč");
            }
        }
    }

    public void printFirstRecreationalBookings(int n){
        int count = 0;
        for (Booking booking : bookings){
            if (!booking.getTypeOfVacation()){
                System.out.println("Rekreační rezervace: " + booking.getArrivaldate()
                + " - " + booking.getDeparturedate() + ", hosté: " + booking.getGuests());
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
            } else if (guestCount == 2) {
                doubleGuest++;
            } else {
                multipleGuest++;
            }
        }

        System.out.println("Celkový počet rezervací s jedním hostem: " + singleGuest);
        System.out.println("Celkový počet rezervací se dvěma hosty: " + doubleGuest);
        System.out.println("Celkový počet rezervací s více než dvěma hosty: " + multipleGuest);
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
