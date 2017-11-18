package factory_method_pattern;

import factory_method_pattern.framework.Factory;
import factory_method_pattern.framework.Product;
import factory_method_pattern.idcard.IDCardFactory;

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
