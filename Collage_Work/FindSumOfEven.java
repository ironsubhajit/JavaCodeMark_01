import java.util.*;
public class FindSumOfEven {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i,j, sum=0;
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (i=0; i <= n; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                numberList.add(i);
            }
        }
        System.out.println(numberList);
        for (j=0; j < numberList.size(); j++) {
            sum += numberList.get(j);
        }
        System.out.println(
                "Sum of all even and also divided by 3 number is: "
                        +sum);

    }
}
