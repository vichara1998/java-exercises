public class Cal implements MyCalculator {

    @Override
    public double getSum(int num1, int num2) {
        return num1 + num2; 
    }

    @Override
    public double getMultipication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public double getSubstraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public double getDivide(int num1, int num2) {
        return  num1 / num2;
    }

}
