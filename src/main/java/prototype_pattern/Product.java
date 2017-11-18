package prototype_pattern;

/**
 * Author: Rivers
 * Date: 2017/11/18 16:14
 */
public interface Product extends Cloneable {

    void use(String str);
    Product createClone();
}
