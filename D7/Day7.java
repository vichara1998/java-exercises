
import java.util.Scanner;

public class Day7{
    public static void main (String[] args ) {
    getFutureAge();    
        }
    public static void getFutureAge(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter name :");
        String name =input.next();
        System.out.println("Enter Age :");
        int age =input.nextInt();
         System.out.println("After 7 years Name and Age :"+ name +(7+age));
    }
}