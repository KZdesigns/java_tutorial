import java.util.ArrayList;
import java.util.Scanner;

/**
 * OddRange
 */
public class OddRange {

    public static void main(String[] args) {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        Scanner min_sc = new Scanner(System.in);
        int min_scanned = min_sc.nextInt();

        Scanner max_sc = new Scanner(System.in);
        int max_scanned = max_sc.nextInt();

        int i = min_scanned;

        while (i <= max_scanned) {
            if (i % 2 != 0) {
                odds.add(i);
            }
            i++;
        }

        System.out.println(odds);
    }
}