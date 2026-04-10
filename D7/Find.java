import java.util.Scanner;

public class Find {

    public static void main(String[] args) {
        int[] val = { 10, 25, 7, 50, 30 };

        // Find max number index
        int maxIndex = findMaxIndex(val);
        System.out.println("Maximum value: " + val[maxIndex] + " at index: " + maxIndex);

        // Find a value entered by user
        boolean found = findVal(val);
        if (found) {
            System.out.println("Value found in array!");
        } else {
            System.out.println("Value not found in array.");
        }
    }

    // Method to find if a value exists in array
    public static boolean findVal(int[] val) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to find: ");
        int find = input.nextInt();

        for (int i = 0; i < val.length; i++) {
            if (val[i] == find) {
                return true; // value found
            }
        }
        return false; // value not found
    }

    // Method to find index of maximum number
    public static int findMaxIndex(int[] val) {
        int maxIndex = 0;
        for (int i = 1; i < val.length; i++) {
            if (val[i] > val[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
