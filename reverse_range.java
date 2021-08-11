import java.util.ArrayList;

/**
 * reverse_range
 */
public class reverse_range {

    public static void main(String[] args) {
        ArrayList<Integer> reverse_range = new ArrayList<Integer>();
        int max = 10;
        int min = 0;

        int i = max;

        while (i >= min) {
            reverse_range.add(i);
            i -= 1;
        }

        System.out.println(reverse_range);
    }
}