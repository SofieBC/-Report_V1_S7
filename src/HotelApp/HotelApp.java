package HotelApp;

import java.util.Scanner;

public class HotelApp {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        HotelApp myApp = new HotelApp();
        HotelLogic logic = new HotelLogic();
        logic.rooms();
        logic.customers();
        handleLogin(myApp, logic);
    }

    private static void handleLogin(HotelApp myApp, HotelLogic logic) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            System.out.println("****************************");
            System.out.println("| HOTEL MANAGEMENT SYSTEM  |");
            System.out.println("****************************");
            System.out.println("*--------Login-------------*");
            System.out.println("| 1. Login as Employer     |");
            System.out.println("| 2. Login as Customer     |");
            System.out.println("| 3. Exit                  |");
            System.out.println("*--------------------------*");
            System.out.println("****************************");

            System.out.print("Select option: ");
            System.out.print("> ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Password: ");
                    String password = input.nextLine();
                    if (password.equals("Admin")) {
                        myApp.runProgram(logic);
                    } else {
                        System.out.println("Wrong password, try again.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Password: ");
                    String password2 = input.nextLine();
                    if (password2.equals("Customer")) {
                        myApp.runProgram2(logic);
                    } else {
                        System.out.println("Wrong password, try again.");
                    }
                    break;
                case 3:
                    System.out.println("Have a nice day!");
                    bool = false;
                    break;
                default:
                    System.out.println("please choose between 1-3");

            }
        }
    }

    public void runProgram(HotelLogic logic) throws Exception {
        boolean running = true;
        while (running) {
            int userMenuChoice = printMenu();
            switch (userMenuChoice) {
                case 1:
                    logic.getAvailableRooms();
                    break;
                case 2:
                    logic.bookRoom();
                    break;
                case 3:
                    logic.showAllRooms();
                    break;
                case 4:
                    logic.showBookedRooms();
                    break;
                case 5:
                    logic.addCustomer();
                    break;
                case 6:
                    logic.cancelBooking();
                    break;
                case 7:
                    logic.showCustomers();
                    break;
                case 8:
                    logic.showAllBookings();
                    break;
                case 9:
                    logic.printToText();
                    break;
                case 10:
                    logic.checkIn();
                    break;
                case 11:
                    logic.checkOut();
                    break;
                case 12:
                    running = false;
                    System.out.println("Thank you for using the services");
                    break;
                default:
                    System.out.println("Enter a proper value");
                    break;
            }
        }
    }

    public int printMenu() {

        System.out.println("*_______ Welcome Employer _______*");
        System.out.println("| 1) show available rooms        |");
        System.out.println("| 2) Add booking                 |");
        System.out.println("| 3) view all rooms              |");
        System.out.println("| 4) View booked rooms           |");
        System.out.println("| 5) Add customers               |");
        System.out.println("| 6) Cancel booking              |");
        System.out.println("| 7) Show all customers          |");
        System.out.println("| 8) show all bookings           |");
        System.out.println("| 9) Print Bookings to a textfile|");
        System.out.println("| 10 Check in room               |");
        System.out.println("| 11 Check out room              |");
        System.out.println("| 12) Exit                       |");
        System.out.println("*________________________________*");
        System.out.print("> ");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    public void runProgram2(HotelLogic logic) throws Exception {
        boolean running = true;
        while (running) {
            int userMenuChoice = printMenu2();
            switch (userMenuChoice) {
                case 1:
                    logic.getAvailableRooms();
                    break;
                case 2:
                    logic.bookRoomForCustomer();
                    break;
                case 3:
                    logic.cancelBooking();
                    break;
                case 4:
                    logic.addCustomerForCustomer();
                    break;
                case 5:
                    //Method
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using the services");
                    break;
                default:
                    System.out.println("Enter a proper value");
                    break;
            }
        }
    }

    public int printMenu2() {

        System.out.println("*____ Welcome Customer ____*");
        System.out.println("| 1) show available rooms  |");
        System.out.println("| 2) Add booking           |");
        System.out.println("| 3) Cancel Booking        |");
        System.out.println("| 4) Enter your information|");
        System.out.println("| 6) Exit                  |");
        System.out.println("*__________________________*");
        System.out.print("> ");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }
}


