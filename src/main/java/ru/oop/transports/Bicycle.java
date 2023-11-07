package ru.oop.transports;

import ru.oop.Person;
import ru.oop.Position;

public class Bicycle implements Transport {

    /**
     * Человек на велосипеде
     */
    private Person person;
    private String brandBicycle;

    public Bicycle(String brandBicycle, Person person) {
        this.brandBicycle = brandBicycle;
        this.person = person;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void ride() {

    }
}
