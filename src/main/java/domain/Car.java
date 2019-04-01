/*
 * Car.java    1.00 20190401
 *
 * Copyright (c) 2019 Hyeonyeong Baek.
 * All rights reserved.
 */
package domain;

import java.util.Random;

public class Car {
    private static final int MAX_RANDOM = 9;
    private static final int STANDARD_NUMBER = 3;

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void race() {
        Random random = new Random();
        int r = random.nextInt(MAX_RANDOM + 1);
        if (r > STANDARD_NUMBER) {
            position++;
        }
    }

    public String getString() {
        String result = name+" : ";
        for (int i = 0; i < position; i++) {
            result += "-";
        }
        return result;
    }

}
