package HotelApp;

import java.util.Scanner;

public class HotelApp {

    private Scanner input = new Scanner(System.in);
    private Object HotelApp;

    public static void main(String[] args) throws Exception {
        HotelApp myApp = new HotelApp();
        HotelLogic logic = new HotelLogic();



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
                    logic.printRooms3();
                    break;
                case 2:

                    logic.bookRoom ();
                    break;
                case 3:
                    logic.getRooms();
                    break;
                case 4:
                    //Metod
                    break;
                case 5:
                    logic.getCustomer();
                    logic.addCustomer(input);
                    //Method
                    break;
                case 6:
                    //metod för edit bookings
                    break;
                case 7:
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

        System.out.println("*____ Welcome Employer ____*");
        System.out.println("| 1) show available rooms  |");
        System.out.println("| 2) Add booking           |");
        System.out.println("| 3) Add rooms             |");
        System.out.println("| 4) View bookings         |");
        System.out.println("| 5) add customers         |");
        System.out.println("| 6) Edit Bookings         |");
        System.out.println("| 7) Exit                  |");
        System.out.println("*__________________________*");
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
                    //Method
                    break;
                case 2:
                    logic.bookRoom();
                    break;
                case 3:
                    //Method
                    break;
                case 4:
                    //Method
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

                //HotelApp[roomNumber].setName(roomName);
        }
    }

    public int printMenu2() {

        System.out.println("*____ Welcome Customer ____*");
        System.out.println("| 1) show available rooms  |");
        System.out.println("| 2) Add booking           |");
        System.out.println("| 6) Exit                  |");
        System.out.println("*__________________________*");
        System.out.print("> ");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }


}


