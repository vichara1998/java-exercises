public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Kamal");
//        System.out.println(student.getName());

        Animal[] animals = new Animal[3];

        animals[0] = new Animal(4, "DOG", "Black");
        animals[1] = new Animal(4, "Cat", "Brown");
        animals[2] = new Animal(4, "Pig", "Pink");

        for (Animal animal : animals) {
            System.out.println(animal.getName());
            System.out.println(animal.getFeet());
            System.out.println(animal.getColor());


        }
    }
}
