import java.util.Scanner;

/**
 * for_loops
 */
public class for_loops {

    public static void main(String[] args) {
        int[] arr = {1,5,7,3,4,5};
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                int total = x += 1;
                System.out.println("Found a five at index " + i + ".");
            }
        }
    }
}