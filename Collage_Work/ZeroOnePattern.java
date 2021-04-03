public class ZeroOnePattern {
    public static void main(String[] args) {
        int i, j;
        int row = Integer.parseInt(args[0]);

        for (i=0; i<row; i++) {
            for (j=0; j<row+i; j++) {
                if (j<row-i-1)
                    System.out.print(" ");
                else{
                    if (j%2 == 0) //even index
                        System.out.print("1");
                    else // odd index
                        System.out.print("0");
                }
            }
            System.out.println("");
        }

        System.out.println(">>> command line argument for rows no. is: " + args[0]);
    }
}
