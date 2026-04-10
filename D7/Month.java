import java.util.Scanner;

public class Month {

    public static void main(String[] args) {
        getMonthCost();   // method call
    }

    public static void getMonthCost() {
        double[] cost = new double[12];
        Scanner input = new Scanner(System.in);

        // Input monthly costs
        System.out.println("Enter cost for 12 months:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            cost[i] = input.nextDouble();
        }

        // Find max cost month
        double maxCost = cost[0];
        int maxMonth = 1;

        for (int i = 1; i < 12; i++) {
            if (cost[i] > maxCost) {
                maxCost = cost[i];
                maxMonth = i + 1;
            }
        }

        // Output result
        System.out.println("\nMaximum cost = " + maxCost);
        System.out.println("Month with maximum cost = " + maxMonth);

        input.close();
    }
}
