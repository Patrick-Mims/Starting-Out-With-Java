package edu.sfsu;

public class App {
    public static void main( String[] args) {
        int i = 0;
        System.out.println( "Car Class" );
        Car car = new Car("Mustang", 1968);
        System.out.println("[Make] " + car.getMake());
        System.out.println("[Year] " + car.getYear());

        do {
            car.accelerate();
            System.out.println("Accelerating Current Speed: " + car.getSpeed());
            i++;
        } while(i < 4);

        do {
            car.brake();
            System.out.println("Braking Current Speed: " + car.getSpeed());
            i--;
        } while(i > 0);
    }
}
