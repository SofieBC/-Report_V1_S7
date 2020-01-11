package HotelApp;

import java.io.Serializable;

public class Room implements Serializable {
    private int roomNumber ;
    private int numberOfBeds;
    private boolean hasBalcony;
    private double pricePerNight;
    private boolean isBooked;
    private Booking booking;

    public Room(){
    }

    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }



    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", numberOfBeds=" + numberOfBeds +
                ", hasBalcony=" + hasBalcony +
                ", pricePerNight=" + pricePerNight +
                ", isBooked=" + isBooked +
                '}';
    }
}
