package HotelApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Booking {
    private int bookingId;
    private LocalDate checkInDate;
    private Date checkOutDate;
    private double totalPrice;

    public Booking(int bookingId, LocalDate checkInDate , ArrayList<Room> roomList) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public LocalDate getCheckInDate() {
        LocalDate checkInDate = LocalDate.parse("");
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
