package HotelApp;

public class HotelApp {
    public static void main(String[] args) {
        HotelApp myApp = new HotelApp();
        HotelLogic logic = new HotelLogic();

        Room room1 = new Room(1,2,true, 50);
        logic.checkInCustomer("555555-555", true);
        logic.roomList.add(room1);

        //Booking book = new Booking(1,2019-12-01, logic.roomList);

        Customer customer1 = new Customer("55555","kalle", "hejvägen12", "07777");

        for(Room room : logic.roomList){
            System.out.println(room);
        }


        myApp.showMenu();
    }

    public void showMenu() {
        //skriv menyn här
    }
}
