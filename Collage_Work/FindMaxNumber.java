import java.lang.*;

public class FindMaxNumber {
    public static void main(String[] args) {
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);
        if (x > y && x > z) {
            System.out.println("Largest no is: "+x);
        } else if (y > x && y > z) {
            System.out.println("Largest no is: "+y);
        } else {
            System.out.println("Largest no is: "+z);
        }
    }
}
