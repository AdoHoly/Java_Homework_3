package SubscriberPackage;

public class SubscriberAddress {
    public SubscriberAddress(String street, int street_number, String city,String state, int psc){
        this.street = street;
        this.street_number = street_number;
        this.city = city;
        this.state = state;
        this.psc = psc;
    }
    public String street;
    public int street_number;
    public String city;
    public String state;
    public int psc;
}
