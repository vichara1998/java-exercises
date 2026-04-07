
// import java.util.Scanner;
// class Demo {
//     public static void main(String[] args) {
//         System.out.println("hello!");
// //Print
//         System.out.print("H2");
//         System.out.println("H32");
// //Data Types
//         double num1 = 44;
//         int num2 = 33;
//         System.out.println(num1 % num2);
// //Scanner
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a Number:");
//         int cal1 = scan.nextInt();
//         System.out.println("Output:" + cal1);
//         // Scanner scan =new Scanner(System.in);
//         System.out.println("enter sal 1");
//         double salary1 = scan.nextDouble();
//         System.out.println("enter sal 1");
//         double salary2 = scan.nextDouble();
//         System.out.println("enter sal 1");
//         double salary3 = scan.nextDouble();
//         System.out.println("Salary avg:" + (salary1 + salary2 + salary3) / 3);
//     }
// }
//---------------------------------
// Day3
// import java.util.Scanner;
// class Day3 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your Name :");
//         String name = input.next();
//         System.out.println("Enter Your age :");
//         int age = input.nextInt();
//         System.out.println("Your age is :" + age + " " + name);
//     }
// }
// class Day3 {
//     public static void main(String[] args) {
//         int num1 = 47;
//         byte num2 = (byte) num1;
//         System.out.println("Number:" + num2);
// if(num1<50 && num2!=num1){
//         double num3 = num1;
//         System.out.println("Number:" + num3);
// }
//     }
// }
import java.util.Scanner;

class Day3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sallary of Familly Member 1:");
        double sal1 = input.nextDouble();

        System.out.println("Sallary of Familly Member 2:");
        double sal2 = input.nextDouble();

        System.out.println("Sallary of Familly Member 3:");
        double sal3 = input.nextDouble();

        System.out.println("Sallary (other):");
        double otherSal = input.nextDouble();

        double totalSallary = sal1 + sal2 + sal3;
        double avgSalary = totalSallary / 3;

        System.out.println("Avg Salaty of All family Members :" + avgSalary);
        if (avgSalary < 50000 && otherSal < 10000) {
            System.out.println("You are eligible for  Aswesuma + Extra Benefits");
        } else if (avgSalary < 50000) {
            System.out.println("You are Eligible for Aswesuma ....");

        } else {
            System.out.println("You are not eligible for Aswesima");
        }
    }
}
// import java.util.Scanner;

// class Day3 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String dbEmail = "abcd@gmail.com";
//         int dbPassword = 1234;
//         System.out.println("Enter your Email:");
//         String email = input.next();
//         System.out.println("Enter your Password");
//         int password = input.nextInt();
//         if (email.equals(dbEmail) && password == dbPassword) {
//             System.out.println("login Success!");
//         } else if (email.equals(dbEmail)) {
//             System.out.println("pssword not match");
//         } else if(password==dbPassword) {
//             System.out.println("email  not match");
//         }else {
//                 System.out.println("Login Fali check Your email and password!");
//         }
//     }

// }
