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

        System.out.println(x);
    }
}