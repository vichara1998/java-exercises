
import java.util.Scanner;

class Day4Practical {

    public static void main(String[] args) {
        String email = "amila@gmail.com";
        String password = "12345";

        Scanner input = new Scanner(System.in);

        int attempts = 5;

        while (attempts > 0) {
            System.out.println("Enter Your Email: (You have " + attempts + " attempts left)");
            String userEmail = input.nextLine().trim();

            System.out.println("Enter Your Password:");
            String userPassword = input.nextLine().trim();

            if (email.equals(userEmail) && password.equals(userPassword)) {
                System.out.println("Login Success");
                input.close();
                return; // exit program after successful login
            } else {
                attempts--; // use one attempt
                if (attempts == 0) {
                    System.out.println("Account locked. Please contact administrator.");
                } else {
                    System.out.println("Wrong email or password. Try again.");
                }
            }
        }

        input.close();
    }
}
