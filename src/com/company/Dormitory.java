package com.company;

import java.util.Arrays;

public class Dormitory implements Rental{
    private Person[] people;
    private String address;

    public Dormitory() {
    }

    public Dormitory(Person[] people, String address) {
        this.people = people;
        this.address = address;
    }

    @Override
    public void payForRent() {
        System.out.println("They are paying a rental dormitory." + '\n');
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
        return "Dormitory:\n"+ Arrays.toString(people) +
                ", address='" + address;
    }
}
