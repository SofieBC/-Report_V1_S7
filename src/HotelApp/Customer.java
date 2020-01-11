package HotelApp;

import java.io.Serializable;

public class Customer implements Serializable {
    private String ssn;
    private String name;
    private String address;
    private String telephoneNumber;

    public Customer(){

    }

    public Customer(String ssn, String name, String address, String telephoneNumber) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
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
