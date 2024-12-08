package org.example.demo7;

import java.util.Random;

public class Sphere implements Shape3DInterface {
    private double radius;

    public Sphere() {
        // Generate a random radius between 1 and 10
        this.radius = 1 + (9 * new Random().nextDouble());
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public String getName() {
        return "Sphere";
    }
}
