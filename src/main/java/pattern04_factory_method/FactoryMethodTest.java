package pattern04_factory_method;

import pattern04_factory_method.framework.Factory;
import pattern04_factory_method.framework.Product;
import pattern04_factory_method.idcard.IDCardFactory;

/**
 * Author: Rivers
 * Date: 2017/11/18 11:28
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product cardOne = factory.create("Hello");
        Product cardTwo = factory.create("World");

        cardOne.use();
        cardTwo.use();
    }
}
