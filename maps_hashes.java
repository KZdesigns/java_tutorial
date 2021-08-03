import java.util.HashMap;
import java.util.Map;

/**
 * maps_hashes
 */
public class maps_hashes {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("Kyle", 15);
        m.put("Lauriane", 7);
        m.put("Tyler", 18);
        m.put("Karisa", 10);
        m.put("Brenda", 22);
        m.put("Kyle", 100);

        boolean n = m.containsKey("kyle");

        System.out.println(m);
    }
    
}