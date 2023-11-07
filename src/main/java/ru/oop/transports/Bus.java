package ru.oop.transports;

import ru.oop.Person;
import ru.oop.Position;

public class Bus implements Transport {

    /**
     * Человек в автобусе
     */
    private Person person;
    private String numberBus;

    public Bus(String numberBus, Person person) {
        this.numberBus = numberBus;
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
