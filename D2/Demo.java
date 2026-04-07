
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        System.out.println("hello!");
//Print
        System.out.print("H2");
        System.out.println("H32");
//Data Types
        double num1 = 44;
        int num2 = 33;
        System.out.println(num1 % num2);

//Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int cal1 = scan.nextInt();
        System.out.println("Output:" + cal1);

        // Scanner scan =new Scanner(System.in);
        System.out.println("enter sal 1");
        double salary1 = scan.nextDouble();
        System.out.println("enter sal 1");
        double salary2 = scan.nextDouble();
        System.out.println("enter sal 1");
        double salary3 = scan.nextDouble();
        System.out.println("Salary avg:" + (salary1 + salary2 + salary3) / 3);
    }
}
