package com.company;

import java.util.Arrays;

public class Apartment implements Utilities {
    private Person[] people;
    private String address;

    public Apartment() {
    }

    public Apartment(Person[] people, String address) {
        this.people = people;
        this.address = address;
    }

    @Override
    public void payForUtility() {
        System.out.println("They pay for utilities." + '\n');
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
        return "Apartment:\n" + Arrays.toString(people) +
                ", address - " + address;
    }
}
