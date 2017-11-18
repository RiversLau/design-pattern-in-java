package prototype_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/11/18 16:15
 */
public class Manager {

    private static Map<String, Product> showCase = new HashMap<>();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String name) {
        Product p = showCase.get(name);
        if (p == null) {
            return null;
        }
        return p.createClone();
    }
}
