package SubscriberPackage;

public class Subscriber{
    public Subscriber(String name_first, String name_last, SubscriberAddress subscriberAddress, String email, int age){
        this.name_first = name_first;
        this.name_last = name_last;
        this.subscriberAddress = subscriberAddress;
        this.email = email;
        this.age = age;
    }

    public Subscriber(String name_first, String name_last, SubscriberAddress subscriberAddress, String email){
        this.name_first = name_first;
        this.name_last = name_last;
        this.subscriberAddress = subscriberAddress;
        this.email = email;
    }

    public String name_first;
    public String name_last;
    SubscriberAddress subscriberAddress;
    public String email;
    public int age;
}
