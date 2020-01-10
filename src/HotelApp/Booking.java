package HotelApp;

import java.util.Date;

public class Booking {
    private static int bookingCounter = 1;
    private int bookingId;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;
    private String ssn;
    private int room;

    public Booking(int room, String ssn) {
        this.bookingId = bookingCounter++;
        //this.checkInDate = checkInDate;
        this.ssn = ssn;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}