package HotelApp;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelLogic {

    ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Booking> bookingList = new ArrayList();

    public void rooms() {
        Room room1 = new Room(1, 2, true, 50);
        Room room2 = new Room(2, 4, true, 100);
        Room room3 = new Room(3, 4, true, 50);
        Room room4 = new Room(4, 2, false, 50);
        Room room5 = new Room(5, 2, false, 50);
        Room room6 = new Room(6, 1, false, 50);

        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);

    }

    public void customers() {
        Customer customer1 = new Customer("11", "11", "11", "11");
        Customer customer2 = new Customer("22", "22", "22", "22");
        Customer customer3 = new Customer("33", "33", "33", "33");
        Customer customer4 = new Customer("44", "44", "44", "44");
        Customer customer5 = new Customer("55", "55", "55", "55");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

    }

    public void showAllRooms() {
        System.out.println("-- All Rooms --");
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    public void getAvailableRooms() {
        System.out.println("-- All available rooms --");
        for (Room room : roomList) {
            if (!room.isBooked()) {
                System.out.println(room);
            }
        }
    }

    public void addCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ssn: ");
        String ssn = input.nextLine();
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter phonenumber: ");
        String phoneNumber = input.nextLine();
        Customer customer = new Customer(ssn, name, address, phoneNumber);

        customerList.add(customer);

    }

    public void showCustomers() {
        System.out.println("-- All Customers --");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    public void cancelBooking() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("-- All bookings --");
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
        System.out.print("choose bookingid to cancel the booking: ");
        int value = input.nextInt();
        input.nextLine();
        System.out.print("are you sure you want to cancel the booking? (yes/no): ");
        String choice = input.nextLine();
        Booking bookingToRemove = getBooking(bookingList, value);
        if (choice.equals("yes")) {
            for (Room room : roomList) {
                room.setBooked(false);
                room.setBooking(null);
            }
            bookingList.remove(bookingToRemove);
        }
    }

    private Booking getBooking(ArrayList<Booking> bookingList, int id) throws Exception {
        for (Booking booking : bookingList) {
            if (booking.getBookingId() == id) {
                return booking;
            }
        }
        throw new Exception("Booking with ID: " + id + "was not found");
    }

    public void bookRoomForCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Available rooms --");
        for (Room room : roomList) {
            if (!room.isBooked())
                System.out.println(room);
        }
        System.out.println("Enter your ssn to book a room: ");
        String ssn = input.nextLine();

        for (Customer customer : customerList) {
            if (ssn.equals(customer.getSsn())) {
                System.out.print("what room do u want to book?: ");
                int bookRoom = input.nextInt();
                input.nextLine();

                for (Room room : roomList) {
                    if (bookRoom == room.getRoomNumber()) {
                        room.setBooked(true);
                        System.out.println("Roomnumber " + room.getRoomNumber() + " is now booked!");
                        Booking booking = new Booking(room, customer.getSsn());
                        bookingList.add(booking);
                    }
                }
            }
        }
    }

    public void bookRoom() {
        Scanner input = new Scanner(System.in);
        System.out.println("-- Available rooms --");
        for (Room room : roomList) {
            if (!room.isBooked())
                System.out.println(room);
        }
        System.out.println("Enter customer ssn to book a room: ");
        String ssn = input.nextLine();

        for (Customer customer : customerList) {
            if (ssn.equals(customer.getSsn())) {
                System.out.print("what room do u want to book?: ");
                int bookRoom = input.nextInt();
                input.nextLine();

                for (Room room : roomList) {
                    if (bookRoom == room.getRoomNumber()) {
                        room.setBooked(true);
                        System.out.println("Roomnumber " + room.getRoomNumber() + " is now booked!");
                        Booking booking = new Booking(room, customer.getSsn());
                        bookingList.add(booking);
                    }
                }
            }
        }
    }

    public void showAllBookings() {
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public void showBookedRooms() {
        System.out.println("-- All Booked rooms --");
        for (Room room : roomList) {
            if (room.isBooked()) {
                System.out.println(room);
            }
        }
    }

    public void addCustomerForCustomer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your ssn: ");
        String ssn = input.nextLine();
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your address: ");
        String address = input.nextLine();
        System.out.print("Enter your telephonenumber: ");
        String phone = input.nextLine();

        customerList.add(new Customer(ssn, name, address, phone));

    }
}
