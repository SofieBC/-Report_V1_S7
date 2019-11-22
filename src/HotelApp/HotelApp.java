package HotelApp;

public class HotelApp {
    public static void main(String[] args) {
        HotelApp myApp = new HotelApp();
        HotelLogic logic = new HotelLogic();
        logic.checkInCustomer("555555-555", true);

        Customer customer1 = new Customer("55555","kalle", "hejvägen12", "07777");

        myApp.showMenu();
    }

    public void showMenu() {
        //skriv menyn här
    }
}
