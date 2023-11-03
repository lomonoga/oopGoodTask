package ru.oop;

/**
 * Человек
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Person {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Пройти до указанного места из текущего местоположения
     *
     * @param destination место назначения
     */
    void walk(Position destination);

    /**
     * Доехать до указанного места из текущего местоположения
     */
    void drive(Position destination);
}
