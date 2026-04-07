
import java.util.Scanner;

class Test {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int max = 0;
        int min = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the number" + (i + 1));
            int num = input.nextInt();

            if (i == 0) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }

        }

        System.out.println(
                "MAX :" + max);
        System.out.println(
                "MIN :" + min);
    }

}
