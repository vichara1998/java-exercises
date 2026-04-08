
import java.util.Scanner;

class Marks {

    public static void main(String[] args) {
        String[] arr1 = new String[2];
        int[] arr2 = new int[2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Name :" + i);
            // System.out.println("Marks :" + j);
            arr1[i] = input.next();
            System.out.println("Marks :" + i);
            arr2[i] = input.nextInt();
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println("Name : " + arr1[j] + "   Marks : "
                    + arr2[j]);
        }
    }
}
