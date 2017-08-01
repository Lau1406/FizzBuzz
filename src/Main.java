import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Laurence on 2017-08-01.
 *
 * A simple modular implementation of the FuzzBuzz game
 */
public class Main {

    public Main(int max, Map<Integer, String> mapping) {
        for (int i = 1; i <= max; i++) {
            StringBuilder output = new StringBuilder();
            Set<Integer> keys = mapping.keySet();
            for (Integer key : keys) {
                if (i % key == 0) {
                    output.append(mapping.get(key));
                }
            }
            if (output.toString().isEmpty()) {
                output.append(i);
            }
            System.out.println(output.toString());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> mapping = new HashMap<>();
        mapping.put(3, Constants.FIZZ);
        mapping.put(5, Constants.BUZZ);
        new Main(100, mapping);
    }
}