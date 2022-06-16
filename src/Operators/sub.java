package Operators;

public class sub extends operators{

    public sub(double num1, double num2) {
        super(num1, num2);
    }

    @Override
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
