import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomerControllerImpl implements CustomerController {
    private final Customer[] customers = new Customer[10];

    @Override
    public Customer generateCustomer() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter id :");
        int id = input.nextInt();

        System.out.println("Enter Name :");
        String name = input.next();

        System.out.println("Enter Address :");
        String address = input.next();

        System.out.println("Enter marks :");
        double marks = input.nextDouble();

        Customer customer = new Customer(id, name, address, marks);
        return customer;
    }

    @Override
    public void addCustomer(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                customers[i] = customer;
            }
        }

    }
}
