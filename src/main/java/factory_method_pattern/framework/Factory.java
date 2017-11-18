package factory_method_pattern.framework;

/**
 * Author: Rivers
 * Date: 2017/11/18 11:15
 */
public abstract class Factory {

    public Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product product);
}
