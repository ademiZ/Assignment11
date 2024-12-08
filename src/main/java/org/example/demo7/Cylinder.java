package org.example.demo7;

import java.util.Random;

public class Cylinder implements Shape3DInterface {
    private double radius;
    private double height;

    public Cylinder() {
        // Generate random radius between 1 and 10 and height between 5 and 20
        this.radius = 1 + (9 * new Random().nextDouble());
        this.height = 5 + (15 * new Random().nextDouble());
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String getName() {
        return "Cylinder";
    }
}
