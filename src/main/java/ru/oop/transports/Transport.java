package ru.oop.transports;

import ru.oop.Positioned;

public interface Transport extends Positioned {
    /**
     * Ехать на транспорте
     */
    void ride();
}
