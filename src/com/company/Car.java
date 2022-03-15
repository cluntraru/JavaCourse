package com.company;

public class Car {
    Car() {
        System.out.println("New car created");
    }

    public void Vroom() {
        System.out.println("Vroom");
    }

    @Override
    public boolean equals(Object obj)
    {
        Car car = (Car) obj;
        return wheelCount == car.wheelCount;
    }

    private int wheelCount = 4;
}
