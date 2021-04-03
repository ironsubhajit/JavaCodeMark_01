import java.lang.*;

public class HelloStudent {
    public static void main(String[] args) {
        for (int i=0; i< args.length; i++) {
            System.out.println(i + " Hello "+args[i]);
        }
    }
}
