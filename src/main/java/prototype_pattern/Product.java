package prototype_pattern;

/**
 * Author: Rivers
 * Date: 2017/11/18 16:14
 */
public abstract class Product implements Cloneable {

    public abstract void use(String str);

    public Product createClone() {

        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
