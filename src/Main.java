import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 =
            new Guest("Adéla Malíková", LocalDate.of(1993, 3, 13));

        Guest guest2 =
                new Guest("Jan Dvořák", LocalDate.of(1995,5,5));

        Room room1 =
                new Room("Balkón s výhelem na moře ", 1, 1, 1000);
        Room room2 =
                new Room("Balkón s výhledem na moře", 2, 1, 1000);
        Room room3 =
                new Room("Bez balkónu, s výhledem na moře", 3, 3, 2400);

        Booking booking1;
        booking1 = new Booking("Pracovní", LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26));

        Booking booking2;
        booking2 = new Booking("Rekreační", LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14));


        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        System.out.println("Počet hostů: " + guestList.size());
        System.out.println();
        System.out.println("Jméno a datum narození prvního hosta: " + guestList.get(0).getName() + " " + guestList.get(0).getBirthdate());
        System.out.println("Jméno a datum narození druhého hosta: " + guestList.get(1).getName() + " " + guestList.get(1).getBirthdate());

        System.out.println();

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        System.out.println("Číslo pokoje: " + roomList.get(0).getRoomNo());
        System.out.println("Počet postelí: " + roomList.get(0).getNumberOfBeds());
        System.out.println("Dispozice: " + roomList.get(0).getDispositions());
        System.out.println("Cena za noc: " + roomList.get(0).getPricePerNight() + " Kč");

        System.out.println();

        System.out.println("Číslo pokoje: " + roomList.get(1).getRoomNo());
        System.out.println("Počet postelí: " + roomList.get(1).getNumberOfBeds());
        System.out.println("Dispozice: " + roomList.get(1).getDispositions());
        System.out.println("Cena za noc: " + roomList.get(1).getPricePerNight() + " Kč");

        System.out.println();

        System.out.println("Číslo pokoje: " + roomList.get(2).getRoomNo());
        System.out.println("Počet postelí: " + roomList.get(2).getNumberOfBeds());
        System.out.println("Dispozice: " + roomList.get(2).getDispositions());
        System.out.println("Cena za noc: " + roomList.get(2).getPricePerNight() + " Kč");

        System.out.println();

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        System.out.println("Rezervace pro: " + guestList.get(0).getName() + " "
                + guestList.get(0).getBirthdate());
        System.out.println("Povaha dovolené: " + bookingList.get(0).getTypeOfVacation());
        System.out.println("Datum příjezdu: " + bookingList.get(0).getArrivaldate());
        System.out.println("Datum odjezdu: " + bookingList.get(0).getDeparturedate());

        System.out.println();

        System.out.println("Rezervace pro: " + guestList.get(0).getName() + " "
                + guestList.get(0).getBirthdate() + " a " +
                guestList.get(1).getName() + " " + guestList.get(1).getBirthdate());
        System.out.println("Povaha dovolené: " + bookingList.get(1).getTypeOfVacation());
        System.out.println("Datum příjezdu: " + bookingList.get(1).getArrivaldate());
        System.out.println("Datum Odjezdu: " + bookingList.get(1).getDeparturedate());

        System.out.println();

        System.out.println("Seznam všech rezervací: " + bookingList.size());

    }
}