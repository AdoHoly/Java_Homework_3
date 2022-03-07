package SubscriberPackage;

public class SubscriberAddress {
    public SubscriberAddress(String street, int street_number, String city,String state, int zip){
        this.street = street;
        this.street_number = street_number;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String street;
    public int street_number;
    public String city;
    public String state;
    public int zip;
}
