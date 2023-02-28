package edu.sfsu;

public class Car {
    private String make;
    private int speed;
    private int year;
    private static int referenceCounter = 0;

    public Car(String make, int year) {
       this.make = make;
       this.speed = 0;
       this.year = year;
       referenceCounter++;
    }

    void accelerate() {
        this.speed += 5;
    }

    void brake() {
        this.speed -= 5;
    }

    public int getReferenceCounter() {
        return referenceCounter;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}