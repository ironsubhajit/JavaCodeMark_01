import java.lang.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int a=0, b, temp, n;
        n = Integer.parseInt(args[0]);
        temp = n;
        while (n>0) {
            b = n % 10;
            n = n / 10;
            a += (b*b*b);
        }
        if (a == temp) {
            System.out.println("Its an Armstrong no.");
        } else {
            System.out.println("Its not an Armstrong no.");
        }
    }
}
