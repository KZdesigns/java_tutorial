import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * sets_lists
 */
public class sets_lists {

    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();
        t.add(5);
        t.add(6);
        t.add(15);
        t.remove(5);
    
        int x = t.size();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.remove(0);
        arr.get(1);
        arr.set(1, 8);

        System.out.println(arr);
    }
}