package HotelApp;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelLogic {

    ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Booking> bookingList = new ArrayList();

    public void Rooms() {
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

    public void cancelBooking() {
        Scanner input = new Scanner(System.in);
        System.out.println("-- All booked rooms --");
        for (Room room : roomList) {
            if (room.isBooked()) {
                System.out.println(room);
            }
        }
        System.out.print("choose roomnumber to cancel the booking: ");
        int value = input.nextInt();
        input.nextLine();
        System.out.print("are you sure you want to cancel the booking? (yes/no): ");
        String choice = input.nextLine();
        for (Room room : roomList) {
            if (choice.equals("yes") && value == room.getRoomNumber()) {
                room.setBooked(false);
                System.out.println("-- Roomnumber " + room.getRoomNumber() + " is now canceled --");
            }
        }
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
            if (ssn.equals(customer.getSsn()))
                System.out.print("What room do you want to book?: ");
            int bookRoom = input.nextInt();
            input.nextLine();

            for (Room room : roomList) {
                if (bookRoom == room.getRoomNumber()) {
                    room.setBooked(true);
                    System.out.println("Roomnumber " + room.getRoomNumber() + " is now booked");
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
                        System.out.println("Roomnumber "+ room.getRoomNumber()+" is now booked!");
                    }
                }
            }else {
                System.out.println("No customer with that ssn");
            }
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




    /*private String[] rooms = new String[10];

    public HotelLogic() {
        initialise();
    }

    private void initialise() {
        for (int x = 0; x < rooms.length; x++) {
            rooms[x] = "e";
        }
        System.out.println("initialization is complete.");
    }

    public void printRooms() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].equals("e")) {
                System.out.println("Room(" + (i + 1) + ") is Empty.");
            } else {
                System.out.println("Room(" + (i + 1) + ") is occupied by " + rooms[i]);
            }
        }
    } */

}
