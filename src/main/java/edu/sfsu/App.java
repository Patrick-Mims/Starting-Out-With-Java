package edu.sfsu;

<<<<<<< HEAD
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
=======
import java.util.stream.DoubleStream;
public class App {
    static double subtract(double... operands) {
       return DoubleStream.of(operands).sum();
    }
    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }
    public static void main( String[] args ) {
        Employee obj1 = new Employee(0,"Accounting","Susan Meyers", "Vice President");
        Employee obj2 = new Employee(1,"Accounting", "Vice President");

        int id = obj1.getIdNumber();
        String name = obj1.getName();
        String department = obj1.getDepartment();
        String position = obj1.getDepartment();

        System.out.println(name + " " + id + " " + department + " " + position);

        id = obj2.getIdNumber();
        department = obj2.getDepartment();
        position = obj2.getPosition();

        System.out.println(id + " " + department + " " + position);

//        Employee em02 = new Employee(1, "IT", "Programmer");
    }
}
>>>>>>> 8620326 (initial add)
