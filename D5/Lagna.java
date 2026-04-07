
import java.util.Scanner;

class Lagna {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Age :");
        int age = input.nextInt();

        System.out.println("Enter Your Name :");
        String name = input.next();

        if (age >= 18) {
            System.out.println(name + " You are Eliible ");
            
            String lagna;

            do {
                System.out.print("Enter your Lagna: ");
                lagna = input.next();

                switch (lagna) {
                    case "Aries":
                        System.out.println("You selected Aries");
                        break;
                    case "Taurus":
                        System.out.println("You selected Taurus");
                        break;
                    case "Gemini":
                        System.out.println("You selected Gemini");
                        break;
                    case "Cancer":
                        System.out.println("You selected Cancer");
                        break;
                    case "Leo":
                        System.out.println("You selected Leo");
                        break;
                    case "Virgo":
                        System.out.println("You selected Virgo");
                        break;
                    case "Libra":
                        System.out.println("You selected Libra");
                        break;
                    case "Scorpio":
                        System.out.println("You selected Scorpio");
                        break;
                    case "Sagittarius":
                        System.out.println("You selected Sagittarius");
                        break;
                    case "Capricorn":
                        System.out.println("You selected Capricorn");
                        break;
                    case "Aquarius":
                        System.out.println("You selected Aquarius");
                        break;
                    case "Pisces":
                        System.out.println("You selected Pisces");
                        break;
                    default:
                        System.out.println(" Invalid Lagna. Please try again.");
                        lagna = ""; 
                }

            } while (lagna.isEmpty());

            System.out.println("Enter how many income resources do you have : ");
            int income = input.nextInt();

            double total = 0;

            for (int i = 0; i < income; i++) {
                System.out.println("Enter your income :" + (i + 1));
                total += input.nextDouble();
            }
            System.out.println("Total Income :" + total);
        } else {
            System.out.println("You are not Eligible Because Yor are Under 18");
        }
    }
}
