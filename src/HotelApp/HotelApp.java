package HotelApp;

import java.util.Scanner;

public class HotelApp {

    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        HotelApp myApp = new HotelApp();
        HotelLogic logic = new HotelLogic();
        logic.getCustomer();

        Room room1 = new Room(1,2,true, 50);
        logic.checkInCustomer("555555-555", true);
        logic.roomList.add(room1);

        //Booking book = new Booking(1,2019-12-01, logic.roomList);

    /*  public void runProgram() {
        boolean running = true;
        while (running) {
            int userMenuChoice = printMenu();
            switch (userMenuChoice) {
                case 1:
                    //Method
                    break;
                case 2:
                    //Metod
                    break;
                case 3:
                    //Method
                    break;
                case 4:
                    //Method
                    break;
                case 5
                    ;
                    running = false;
                    System.out.println("Thank you for using the services");
                    break;
                default:
                    System.out.println("Enter a proper value");
                    break;
            }*/

       /* public void runProgram () {
            boolean running = true;
            while (running) {
                int userMenuChoice = printMenu ();
                switch (userMenuChoice) {
                    case 1:
                        //Method
                        break;
                    case 2:
                        //Metod
                        break;
                    case 3:
                        //Method
                        break;
                    case 4:
                        //Method
                        break;
                    case 5
                        ;
                        running = false;
                        System.out.println ("Thank you for using the services");
                        break;
                    default:
                        System.out.println ("Enter a proper value");
                        break;
                }


<<<<<<< HEAD

            }


        }
    }

    public int printMenu() {
=======
                HotelApp myApp = new HotelApp ();
                HotelLogic logic = new HotelLogic ();
                logic.checkInCustomer ("555555-555", true);

                Customer customer1 = new Customer ("55555", "kalle", "hejvägen12", "07777");

                myApp.printMenu ();
            }


        }*/

    }

    public int printMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("*______ Welcome ______*");
        System.out.println("| 1) Add booking      |");
        System.out.println("| 2) Cancel booking   |");
        System.out.println("| 3) View rooms       |");
        System.out.println("| 4) View bookings    |");
        System.out.println("| 5) Previous bookings|");
        System.out.println("| 6) Exit             |");
        System.out.println("*_____________________*");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;

    }

}
