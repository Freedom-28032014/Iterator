package org.example;

import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    protected int min; // минимальное значение
    protected int max; // максимальное значение

    public Randoms(int min, int max) {
        this.min = min; // минимальное значение
        this.max = max; // максимальное значение
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return min > 0 && max > 0; // проверка на корректность значений
            }

            @Override
            public Integer next() {
                return (int) (Math.round((Math.random() * (max - min)) + min)); // целое случайное число, формула
            }

        };
    }
}
