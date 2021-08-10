import java.util.ArrayList;
import java.util.Scanner;

/**
 * range
 */
public class range {

    public static void main(String[] args) {
        ArrayList<Integer> range = new ArrayList<Integer>();

        Scanner min_sc = new Scanner(System.in);
        String min_scanned = min_sc.next();
        int min = Integer.parseInt(min_scanned);

        Scanner max_sc = new Scanner(System.in);
        String max_scanned = max_sc.next();
        int max = Integer.parseInt(max_scanned);

        int i = min;

        while (i <= max) {
            range.add(i);
            i++;
        }

        System.out.println(range);
    }
}