import java.util.ArrayList;
import java.util.Scanner;

/**
 * factors
 */
public class factors {

    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<Integer>();

        Scanner input_num = new Scanner(System.in);
        int num = input_num.nextInt();

        int i = 1;

        while (i <= num) {
            if (num % i == 0) {
                factors.add(i);
            }

            i++;
        }

        System.out.println(factors);
    }
}