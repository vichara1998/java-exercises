import java.util.Scanner;

public class Testcal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2 : ");
        int num2 = scanner.nextInt();

        MyCalculator mycal = new Cal();
        mycal.getSum(num1, num2);
        mycal.getMultipication(num1, num2);
        mycal.getSubstraction(num1, num2);
        mycal.getDivide(num1, num2);
    }

}
