
import java.util.Scanner;

class Arrays {

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner inputAr = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter Arr Number " + i + ":");
            arr[i] = inputAr.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arrat List :" + arr[i]);

        }

    }
}
