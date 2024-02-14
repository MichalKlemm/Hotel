package com.engeto.ja.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private boolean typeOfVacation;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private int numberOfGuests;
    private boolean hasSeaView;
    private BigDecimal price;
    private List<Guest> guests;



    public Booking(boolean typeOfVacation, LocalDate arrivalDate, LocalDate departureDate, int numberOfGuests, boolean hasSeaView, BigDecimal price) {
        this.typeOfVacation = typeOfVacation;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.numberOfGuests = numberOfGuests;
        this.hasSeaView = hasSeaView;
        this.price = price;
        this.guests = new ArrayList<>();

    }


    public boolean getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(boolean typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public LocalDate getArrivaldate() {
        return arrivalDate;
    }

    public void setArrivaldate(LocalDate arrivaldate) {
        this.arrivalDate = arrivaldate;
    }

    public LocalDate getDeparturedate() {
        return departureDate;
    }

    public void addGuest(Guest guest){
        if (guest == null){
            guests = new ArrayList<>();
        }
        guests.add(guest);
    }

    public List<Guest> getGuests(){
        return guests;
    }

    public int getNumberOfGuests(){
        return numberOfGuests;
    }

    public long getBookingLength(){
        return ChronoUnit.DAYS.between(arrivalDate, departureDate);
    }

    public BigDecimal getPrice(){
        long lengthOfStay = getBookingLength();
        return price.multiply(BigDecimal.valueOf(lengthOfStay));
    }

    public boolean hasSeaView(){
        return hasSeaView;
    }

    public void setNumberOfGuests(int numberOfGuests){
        this.numberOfGuests = numberOfGuests;
    }

    public void setDeparturedate(LocalDate departuredate) {
        this.departureDate = departuredate;
    }

    public String returnTypeOfVacation(){
        String stayType;
        if (typeOfVacation){
            stayType = "Pracovní";
        }else {
            stayType = "Rekreační";
        }

        return stayType;
    }
}

