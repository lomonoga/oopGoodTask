package ru.oop.transports;

import ru.oop.Person;
import ru.oop.Position;

public class Metro implements Transport {

    /**
     * Человек в метро
     */
    private Person person;
    private String numberMetro;

    public Metro(String numberMetro, Person person) {
        this.numberMetro = numberMetro;
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
