public class Pattern01 {
    public static void main(String[] args) {
        int row = Integer.parseInt(args[0]);
        String star = "* ";
        for (int i = 0; i < row; i++) {
            System.out.println(star.repeat(2));
        }
        System.out.println(">>> command line argument for rows no. is: " + args[0]);
    }
}