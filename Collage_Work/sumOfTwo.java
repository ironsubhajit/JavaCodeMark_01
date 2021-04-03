import java.lang.*;

public class sumOfTwo {
    public static void main(String[] args) {
        int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
        System.out.println("Sum of "+args[0]+" and "+args[1]+" is: "+sum);
    }
}
