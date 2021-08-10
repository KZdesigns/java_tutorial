import java.util.ArrayList;

/**
 * Yell
 */
public class Yell {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> yelled_words = new ArrayList<String>();

        words.add("Hello");
        words.add("World");

        System.out.println(words);

        for (String word : words) {
            String yelled_word = word + "!";
            yelled_words.add(yelled_word);
        }

        System.out.println(yelled_words);

    }
}