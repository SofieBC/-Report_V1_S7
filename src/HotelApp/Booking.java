package HotelApp;

import java.util.ArrayList;
import java.util.Date;

public class Booking {
    private int bookingId = 0;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;
    private String ssn;

    public Booking(int bookingId, Date checkInDate, ArrayList<Room> roomList, String ssn) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.ssn = ssn;
    }

    public int getBookingId(int bookingId) {
        bookingId += 1;
        return bookingId;
    }
}