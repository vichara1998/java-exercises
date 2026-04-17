public class Test {
    public static void main(String[] args) {
        //System.out.println("Happy New Year");
        CustomerController customerController = new CustomerControllerImpl();
        Customer customer =customerController.generateCustomer();
        customerController.addCustomer(customer);
    }
}