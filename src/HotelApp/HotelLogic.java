package HotelApp;

import java.util.ArrayList;

public class HotelLogic {
    private ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    public void getCustomer() {
        Customer customer1 = new Customer ("555", "Kalle", "hov 12", "0755555");
        Customer customer2 = new Customer ("444", "Johanna" , "Hotellv 23", "0708486321");
        Customer customer3 = new Customer ("333", "Adam", "Kristianstadv 1", "0722484848");
        Customer customer4 = new Customer ("222", "Adina", "Lundav 487", "0732554620");


        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);

        System.out.println(customerList);
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
}
