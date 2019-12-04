package HotelApp;

import java.util.ArrayList;

public class Customer {
    private String ssn;
    private String name;
    private String address;
    private String telephoneNumber;

    public Customer(String ssn, String name, String adress, String telephoneNumber) {
        this.ssn = ssn;
        this.name = name;
        this.address = adress;
        this.telephoneNumber = telephoneNumber;


    }

    @Override
    public String toString() {
        return "[Customer: " +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ']' + "\n";
    }

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }
}
