package ru.oop.transports;

import ru.oop.Person;
import ru.oop.Position;

public class Car implements Transport {

    /**
     * Человек в машине
     */
    private Person person;
    private String brandCar;

    public Car(String brandCar, Person person) {
        this.person = person;
        this.brandCar = brandCar;
    }

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void ride() {

    }
}
