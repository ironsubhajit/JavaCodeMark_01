import java.lang.*;

public class Fibo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 0; //1st number of the series
        int b = 1; //2nd number of the series
        int c;
        for(int i=0; i<n; i++) {
            System.out.print(a+" ");
            c = (a+b);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
