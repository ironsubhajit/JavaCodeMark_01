import java.lang.*;

public class NumberPyramid {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        int i=0, j=0, k=0;
        for (i=0; i<row; i++) {
            k=1;
            for (j=0; j<(row+i); j++) {
                if (j<row-i-1)
                    System.out.print(" ");
                else {
                    System.out.print(k);
                    if (j<(row-1))
                        k++;
                    else
                        k--;
                }
            }
            System.out.println("");
        }
        System.out.println(">>> command line argument for rows no. is: " + args[0]);
    }

    public static class hello {
        public static void main(String[] args){
            System.out.println("hello "+args[0]);
        }
    }
}