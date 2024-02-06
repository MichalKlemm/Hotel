package com.engeto.ja.hotel;

import java.time.LocalDate;

public class Booking {

    private String typeOfVacation;

    private LocalDate arrivaldate;

    private LocalDate departuredate;

    public Booking(String typeOfVacation, LocalDate arrivaldate, LocalDate departuredate) {
        this.typeOfVacation = typeOfVacation;
        this.arrivaldate = arrivaldate;
        this.departuredate = departuredate;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }

    public LocalDate getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(LocalDate arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public LocalDate getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(LocalDate departuredate) {
        this.departuredate = departuredate;
    }
}

