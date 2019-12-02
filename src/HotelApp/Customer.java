package HotelApp;

public class Customer {
    private String ssn;
    private String name;
    private String adress;
    private String telephoneNumber;

    public Customer(String ssn, String name, String adress, String telephoneNumber) {
        this.ssn = ssn;
        this.name = name;
        this.adress = adress;
        this.telephoneNumber = telephoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
