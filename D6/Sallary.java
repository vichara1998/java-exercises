
import java.util.Scanner;

class Sallary {

    public static void main(String[] args) {
        double[] arr = new double[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter employee Sallary :" + i);
            arr[i] = input.nextDouble();
        }
        System.out.println("\nEmployee Salaries:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + arr[i]);
        }
    }
}
