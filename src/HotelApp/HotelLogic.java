package HotelApp;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelLogic {

    ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Booking> bookingList = new ArrayList();


    public void getRooms() {

        Room room1 = new Room(1, 2, true, 50);
        Room room2 = new Room(2, 2, false, 50);

        roomList.add(room1);
        roomList.add(room2);

        System.out.println(roomList);
    }

    public void getAvailableRooms() {
        System.out.println("-- All available rooms --");
        for (Room room : roomList) {
            if (!room.isBooked()) {
                System.out.println(room);
            }
        }
    }


    public void addCustomer(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ssn: ");
        String ssn = input.nextLine();
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter phonenumber: ");
        String phoneNumber = input.nextLine();
        Customer customer = new Customer(ssn,name, address,phoneNumber);

        customerList.add(customer);

    }

    public void bookRoom() {
        int InputRoomNumber;
        String RoomName;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roomnumber you would like to book (1-2): ");
        int roomNumber = input.nextInt() - 1;
        System.out.println("Would you like to check in now? 1) Yes 2) No");
        InputRoomNumber = Integer.parseInt(input.next());
        String roomName = new String();
    }

    private String[] rooms = new String[10];

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
    }

}
