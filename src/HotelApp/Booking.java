package HotelApp;

import java.util.ArrayList;
import java.util.Date;

public class Booking {
    private int bookingId = 0;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;

    public Booking(int bookingId, Date checkInDate, ArrayList<Room> roomList) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
    }

    public int getBookingId(int bookingId) {
        bookingId += 1;
        return bookingId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
