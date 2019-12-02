package HotelApp;

import java.util.ArrayList;

public class HotelLogic {
    ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Customer> customerList = new ArrayList<Customer>();




    public Customer getCustomer(Customer ssn) {
        return ssn;
    }

    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = null;
        return null;
    }

    public Room getRoom(int roomNumber) {

        return null;
    }

    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = null;
        return null;
    }

    public boolean addCustomer(Customer customer) {
        return true;
    }

    public boolean addRoom(Room room) {

        return true;
    }

    public boolean checkInCustomer(String ssn, boolean booking) {
        return true;
    }

    public boolean checkOutCustomer(String ssn, int bookingId) {
        return false;
    }

    @Override
    public String toString() {
        return "HotelLogic{" +
                "roomList=" + roomList +
                ", customerList=" + customerList +
                '}';
    }
}
