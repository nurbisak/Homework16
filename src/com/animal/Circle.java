package com.animal;

public class Circle {
    private static final double PI = Math.PI;

    public Circle() {

    }

    static void area(int radius) {
        System.out.println(PI * (radius * radius));

    }

    static void circumference(int radius) {
        System.out.println(PI * 2 * radius);
    }
}
