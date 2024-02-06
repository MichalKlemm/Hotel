package com.engeto.ja.hotel;

import java.math.BigDecimal;

public class Room {

    private String dispositions;

    private int RoomNo;

    private int numberOfBeds;

    private BigDecimal pricePerNight;

    public Room(String dispositions, int roomNo, int numberOfBeds, int pricePerNight) {
        this.dispositions = dispositions;
        RoomNo = roomNo;
        this.numberOfBeds = numberOfBeds;
        this.pricePerNight = BigDecimal.valueOf(pricePerNight);
    }

    public String getDispositions() {
        return dispositions;
    }

    public void setDispositions(String dispositions) {
        this.dispositions = dispositions;
    }

    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int roomNo) {
        RoomNo = roomNo;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}


