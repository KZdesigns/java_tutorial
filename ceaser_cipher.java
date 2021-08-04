import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * ceaser_cipher
 */
public class ceaser_cipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int cipher = scanner.nextInt();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        int i = 0;
        ArrayList<Character> cipherStr = new ArrayList<Character>();
        String new_str = "";

        for (char letter : str.toCharArray()) {
            int index = alpha.indexOf(letter);
            int new_index = (index + cipher) % 26;

            char[] alphaCharArray = alpha.toCharArray();
            char new_char = alphaCharArray[new_index];
            cipherStr.add(new_char);
            i++;
        }

        for (Character letter : cipherStr) {
            new_str += letter.toString();
        }

        System.out.println(new_str);
    }
}