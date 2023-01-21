package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(30, 20);
        mercedes.move(-20, 10);
        mercedes.accelerate(30);

        mercedes.accelerate(-10);
    }
}