package com.engeto.ja.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Booking {

    private boolean typeOfVacation;

    private LocalDate arrivalDate;

    private LocalDate departureDate;

    private int numberOfGuests;


    public Booking(boolean typeOfVacation, LocalDate arrivalDate, LocalDate departureDate) {
        this.typeOfVacation = typeOfVacation;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.numberOfGuests = numberOfGuests;
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

    public int getNumberOfGuests(){
        return numberOfGuests;
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

