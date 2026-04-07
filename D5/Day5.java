
import java.util.Scanner;

class Day5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maxNum = 0;
        int minNum = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter " + (i + 1) + " number : ");
            int enterNum = scan.nextInt();

            if (i == 0) {
                maxNum = enterNum;
                minNum = enterNum;
            }

            if (enterNum > maxNum) {
                maxNum = enterNum;
            } else if (enterNum < minNum) {
                minNum = enterNum;
            }
        }

        System.out.println("Max number is : " + maxNum);
        System.out.println("Min number is : " + minNum);
    }
}
