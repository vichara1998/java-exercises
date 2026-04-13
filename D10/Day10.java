class Day10 {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        // v1.name = "Car";incorrect
        v1.setName("Car");// Correct way

        // v1.tyre = 4;incorrect
        v1.setTyre(4);

        // v1.brand = "Toyota";// incorrect
        v1.setBrand("Toyota");

        // v1.color = "Red";incorrect
        v1.setColor("Red");

        // v1.price = 25000;incorrect
        v1.setPrice(25000.0);

        Vehicle v2 = new Vehicle();
        /*
         * v2.name = "Bike";incorrect
         * v2.tyre = 20; Not possible value and incorrect
         * v2.brand = "Honda";incorrect
         * v2.color = "Black";incorrect
         * v2.price = 1500;incorrect
         */

        Vehicle v3 = new Vehicle();
        /*
         * v3.name = "Truck";incorrect
         * v3.tyre = 6;incorrect
         * v3.brand = "Volvo";incorrect
         * v3.color = "Blue";incorrect
         * v3.price = 50000;incorrect
         */
    }
}

class Vehicle {
    private String name;
    private int tyre; // Number of tyres
    private String brand;
    private String color;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTyre(int tyre) {
        this.tyre = tyre;
    }

    public int getTyre() {
        return tyre;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

}