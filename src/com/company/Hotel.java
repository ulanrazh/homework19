package com.company;

import java.util.Arrays;

public class Hotel implements Rental {
    private Person[] people;
    private String address;

    public Hotel() {
    }

    public Hotel(Person[] people, String address) {
        this.people = people;
        this.address = address;
    }

    @Override
    public void payForRent() {
        System.out.println("They pays for hotel rent a huge amount money." + '\n');
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hotel:\n" + Arrays.toString(people) +
                ", address='" + address;
    }
}
