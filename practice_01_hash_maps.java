import java.util.HashMap;
import java.util.Map;

/**
 * practice_01_hash_maps
 */
public class practice_01_hash_maps {

    public static void main(String[] args) {
        String sentence = "hello";
        Map m = new HashMap();
        

        for(int i = 0; i < sentence.length(); i++) {
            if (m.containsKey(sentence.charAt(i))) {
                char key = sentence.charAt(i);
                int value = (int) m.get(key);
                int new_value = value + 1;
                m.put(sentence.charAt(i), new_value);
            } else {
                m.put(sentence.charAt(i), 1);
            }
        }

        System.out.println(m);
        // System.out.println(sentence.charAt(0));

    }
}