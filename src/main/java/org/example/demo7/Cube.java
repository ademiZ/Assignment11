package org.example.demo7;

import java.util.Random;

public class Cube implements Shape3DInterface {
    private double sideLength;

    public Cube() {
        // Generate random side length between 1 and 10
        this.sideLength = 1 + (9 * new Random().nextDouble());
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double volume() {
        return Math.pow(sideLength, 3);
    }

    public String getName() {
        return "Cube";
    }
}

