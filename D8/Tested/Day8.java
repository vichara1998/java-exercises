package Tested;
import java.util.Arrays;

class Day8 {

    public static void main(String[] args) {
        System.out.println("Values are Equal or not: " + checkEquality());
    }

    public static boolean checkEquality() {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 20, 33, 40, 55};

        return Arrays.equals(arr1, arr2);
    }
}
