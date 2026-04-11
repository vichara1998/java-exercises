package Tested;
public class Oop {

    // Attributes
    int age;
    String name;
    boolean smokes;
}

class Main {
    public static void main(String[] args) {

        // Copy
        Oop std1 = new Oop();
        // Add Data
        std1.age = 12;
        std1.name = "Bandara";
        std1.smokes = false;
        System.out.println("Student Data List :" + std1.name + " " + std1.age + " " + std1.smokes);
    }
}
