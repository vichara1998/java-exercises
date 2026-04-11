
public class Vehicle {

    int wheels;
    String colour;
    String brand;
    int horsePower;
}

class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle();
        car.wheels = 4;
        car.colour = "Red";
        car.brand = "Volvo";



        
        car.horsePower = 1000;
        System.out.println(car.wheels);
    }
}
