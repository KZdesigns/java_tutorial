/**
 * hello
 */
public class hello {

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        double z = 56;
        double sum = x * y * z;
        double power = Math.pow(sum, y);
        double mod = z % x;

        System.out.println(mod);
    }
}