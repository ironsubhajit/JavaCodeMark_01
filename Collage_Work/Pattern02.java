import java.lang.*;

public class Pattern02 {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        String star = "* ", space = " ";

        for (int i = 1; i <= row; i++) {
            System.out.println(space.repeat(row - i) + star.repeat(i)); // Concatenating
        }

        System.out.println(">>> command line argument for rows no. is: " + args[0]);
    }
    
}
