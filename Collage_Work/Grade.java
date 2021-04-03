import java.lang.*;

public class Grade {
    public static void main(String[] args){
        int marks = Integer.parseInt(args[0]);
        if (marks >= 90) {
            System.out.println("Outstanding");
        } else if (80 <= marks) {
            System.out.println("Excellent");
        } else if (70 <= marks) {
            System.out.println("Good");
        } else if (60<=marks) {
            System.out.println("Average");
        } else if (50<=marks) {
            System.out.println("Poor");
        } else {
            System.out.println("Fail");
        }
    }
}
