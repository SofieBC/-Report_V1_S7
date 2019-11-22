package HotelApp;

public class Room {
    private int roomNumber ;
    private int numberOfBeds;
    private boolean hasBalcony;
    private double pricePerNight;
    private boolean isBooked;

    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
