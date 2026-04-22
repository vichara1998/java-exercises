import com.bandara.app.exception.Calculator;
import com.bandara.app.exception.NewException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int number1 = input.nextInt();

        System.out.println("Enter a number 2 :");
        int number2 = input.nextInt();

        try {
            int add = number1 / number2;
            System.out.println("Answer :" + add);
        } catch (ArithmeticException ex) {
            System.out.println("Do not enter \"0\" ");
        }
*/
        //----------------------------------------------------------------
/*
         System.out.println("Enter String :");
        Scanner input2 = new Scanner(System.in);
        try {
            String str = input2.next();
            int val = Integer.parseInt(str);
            System.out.println(str);
        } catch (NumberFormatException e) {
            System.out.println("Do not enter text only, numbers");
        }
*/
        //----------------------------------------
/*
        int[] arr = new int[3];
        try {
            arr[4] = 70;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of bound");
        }
*/
        //-----------Compile Time---------------------
/*
        try {
            Class.forName("com.add.bandara.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
*/
        Calculator cal = new Calculator();

        try {
            int answer = cal.getAnswer(); // Store add value
            System.out.println(answer);
        }catch (ArithmeticException ex){
            System.out.println("Do not use No \"0\" ");
        }

/*
        System.out.println(cal.getAnswer());//without store value
        System.out.println(Calculator.getAnswer());  /Dirctly
*/int val=50;
        if(val>20){
            throw new NewException("Error");
        }
    }
}