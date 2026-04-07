
// import java.util.Scanner;
// class Day4 {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your name : ");
//         String name = input.next();
//         System.out.println("your name is " + name);
//         System.out.println("O/L Result" + "" + "True/False");
//         boolean ol = input.nextBoolean();
//         if(ol==true){
// System.out.println("Pass");
//         }else{          
// System.out.println("Fail");
//         }
//         System.out.println("O/L Result" + "" + "True/False" + ol);
//         System.out.println("A/L Result" + "" + "True/False");
//         boolean al = input.nextBoolean();
//         if(al==true){
// System.out.println("Pass");
//         }else{      
// System.out.println("Fail");
//         }
//         if (ol && al) {
//             System.out.println("You are eligible for the Manger Position");
//         } else {
//             System.out.println("You are eligible for the officer position");
//         }
//     }
// }
import java.util.Scanner;

class Day4 {

    public static void main(String[] args) {
        //int val1 = 5;
//         switch (val1) {
//             case 5 :
//                 System.out.println("1111");
//             case 10 :
//                 System.out.println("2222");
//             case 15 :
//                 System.out.println("3333");
//             default :
//                 System.out.println("Not matched Anything....");

//         }
//     }
// }
        // ++val1;
        // System.out.println(val1++);
        // System.out.println(val1);
        Scanner input = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("names " + (i + 1));
            total += input.nextInt();
        }
        int avgTotal = total / 5;
        System.out.println("Average Total : " + avgTotal);
    }S
}
