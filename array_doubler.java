import java.util.ArrayList;
import java.util.Scanner;

/**
 * array_doubler
 */
public class array_doubler {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> doubled = new ArrayList<Integer>();

        arr.add(2);
        arr.add(4);
        arr.add(6);

        System.out.println(arr);

        for (int i : arr) {
            int new_val = i * 2;
            doubled.add(new_val);
        }

        System.out.println(doubled);
    }
}