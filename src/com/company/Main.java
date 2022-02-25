package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person((byte)5);
        Person person2 = new Person((byte)7);
        Person person3 = new Person((byte)4);
        Person person4 = new Person((byte)6);

        Person[] family1 = {person1};
        Person[] family2 = {person2};
        Person[] family3 = {person3, person4};

        Apartment apartment = new Apartment(family1,"Bishkek city, Manas aveniu, 75");
        System.out.println(apartment);
        apartment.payForUtility();

        Dormitory dormitory = new Dormitory(family2,"Bishkek city, Manas University");
        System.out.println(dormitory);
        dormitory.payForRent();

        Hotel hotel = new Hotel(family3,"Bishkek city, Hotel Jannat Residency");
        System.out.println(hotel);
        hotel.payForRent();








    }
}
