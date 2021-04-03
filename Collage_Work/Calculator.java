import java.lang.*;

public class Calculator {
    public static void main(String[] args) {
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[2]);
        String op = args[1];

        switch (op) {
            case "+":
                System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction of " + a + " and " + b + " is: " + (a - b));
                break;
            case "*":
                System.out.println("Multiplication of " + a + " and " + b + " is: " + (a * b));
                break;
            case "/":
                System.out.println("Division of " + a + " and " + b + " is: " + (a / b));
                break;
            default:
                System.out.println("Something Went Wrong!!");
        }
    }
}
