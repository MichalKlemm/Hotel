package com.engeto.ja.hotel;

import java.time.LocalDate;

public class Booking {

    private boolean typeOfVacation;

    private LocalDate arrivalDate;

    private LocalDate departureDate;


    public Booking(boolean typeOfVacation, LocalDate arrivalDate, LocalDate departureDate) {
        this.typeOfVacation = typeOfVacation;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
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

