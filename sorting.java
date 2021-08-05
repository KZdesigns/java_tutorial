import java.util.Arrays;

/**
 * sorting
 */
public class sorting {

    public static void main(String[] args) {
        int[] x = { 4, 6, 2, 8, 1, 8, 9, 0, 3, 4, 5, 6, 1, 2, 7, 3, 2, 7 };

        Arrays.sort(x);

        for (int i : x) {
            System.out.print(i + ", ");
        }
    }
}