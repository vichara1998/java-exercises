
import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        System.out.println("Welcome to The application !");
        Scanner input = new Scanner(System.in);
        System.out.println("How many students in the class room :");
        int s = input.nextInt();

        for (int i = 1; i <= s; i++) {
            System.out.println("Enter " + i + " Student name :");
            String name = input.next();
        }

        for (int j = 1; j <= s; j++) {
            System.out.println("Enter" + j + " Student Maths marks :");
            int maths = input.nextInt();
            System.out.println("Enter" + j + " Student Scince marks :");
            int scince = input.nextInt();
            System.out.println("Enter " + j + " Student English marks :");
            int english = input.nextInt();

            int avg = (maths + scince + english) / 3;
            System.out.println("Student " + j + " AVG marks :" + avg);

            if (avg >= 75) {
                System.out.println("Student" + j + " Your grade is " + "A");
            } else if (avg >= 65) {
                System.out.println("Student" + j + " Your grade is " + "B");
            } else if (avg >= 55) {
                System.out.println("Student" + j + " Your grade is " + "C");
            } else {
                System.out.println("Student" + j + " Your grade is " + "F");
            }

        }

    }
}
