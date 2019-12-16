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

    public void getCustomer() {
        Customer customer1 = new Customer("555", "Kalle", "hov 12", "0755555");
        Customer customer2 = new Customer("444", "Johanna", "Hotellv 23", "0708486321");
        Customer customer3 = new Customer("333", "Adam", "Kristianstadv 1", "0722484848");
        Customer customer4 = new Customer("222", "Adina", "Lundav 487", "0732554620");

        roomList.add(room1);
        roomList.add(room2);

        Customer customer1 = new Customer("555", "Kalle", "hov 12", "0755555");
        Customer customer2 = new Customer("444", "Johanna", "Hotellv 23", "0708486321");
        Customer customer3 = new Customer("333", "Adam", "Kristianstadv 1", "0722484848");
        Customer customer4 = new Customer("222", "Adina", "Lundav 487", "0732554620");


        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
    }

    public void getRooms() {
        System.out.println(roomList);
    }

    public void getCustomer() {
        System.out.println(customerList);
    }


    public Room getRoom(int roomNumber) {
        return null;
    }

    public void getAvailableRooms() {
        for (Room room : roomList) {
            if (!room.isBooked()) {
                System.out.println(room);
            }
        }
    }


    public boolean addCustomer(Customer customer) {
        return true;
    }

    public boolean addRoom(Room room) {
        return true;
    }

    public void checkInCustomer() {
        for (Customer customer : customerList) {

            if (customer.getSsn().equals("555")) {

                if (customer.getSsn().equals("555")) {

                    //System.out.println(customer.getSsn("555"));
                }
            }
        }

        public boolean checkOutCustomer (String ssn,int bookingId) {
            return false;
        }

        @Override
        public String toString () {
            return; = "HotelLogic{" +
                    "roomList=" + roomList +
                    ", customerList=" + customerList +
                    '}';
            return;
        }


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

    public void addCustomer(Scanner input) {
        int roomNum = 0;
        while (roomNum - 1 < 0 || roomNum - 1 > rooms.length - 1) {
            System.out.println("Enter a room number from (1-" + (rooms.length) + "):");
            roomNum = input.nextInt();
        }

        System.out.println("Please provide the customer name for room " + (roomNum) + " :");
        String customer = input.nextLine();
        input.nextLine();
        rooms[roomNum - 1] = customer;
    }

}
