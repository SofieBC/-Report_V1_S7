package HotelApp;

import java.io.Serializable;
import java.util.Date;

public class Booking implements Serializable {
    private static int bookingCounter = 1;
    private int bookingId;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;
    private String ssn;
    private Room room;

    public Booking(){

    }

    public Booking(Room room, String ssn) {
        this.bookingId = bookingCounter++;
        //this.checkInDate = checkInDate;
        this.ssn = ssn;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public int getBookingId() {
        return bookingId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", room='" + room + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}