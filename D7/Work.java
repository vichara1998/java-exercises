import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        double[] salary = { 3000.00, 3200.00, 7800.00, 4500.00, 2500.00 };
        System.out.println("Salaries: " + Arrays.toString(salary));

        double[] updatedSalary = incrementSalary(salary);

        System.out.println("Updated salaries: " + Arrays.toString(updatedSalary));
    }

    public static double[] incrementSalary(double[] salary) {
        double[] newSalary = new double[salary.length];
        int i = 0;

        // For-each loop to calculate increment
        for (double s : salary) {
            newSalary[i] = s + s * 0.1; // 10% increment
            i++;
        }

        return newSalary;
    }
}






/*
import java.util.Arrays;

public class Work {
    public static void main(String[] args) {
        double[] sal = incrementSalary(); // call method without argument
        System.out.println("Updated salaries: " + Arrays.toString(sal));
    }

    public static double[] incrementSalary() {
        double[] salary = { 3000.00, 3200.00, 7800.00, 4500.00, 2500.00 };

        for (int i = 0; i < salary.length; i++) {
            salary[i] = salary[i] + (salary[i] * 0.1); // 10% increment
        }

        return salary;
    }
}

*/
