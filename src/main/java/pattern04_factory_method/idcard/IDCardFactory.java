package pattern04_factory_method.idcard;

import pattern04_factory_method.framework.Factory;
import pattern04_factory_method.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Rivers
 * Date: 2017/11/18 11:22
 */
public class IDCardFactory extends Factory {

    private Map<Integer, String> dataBase = new HashMap<>();
    private Integer serial = 100;

    @Override
    public synchronized Product createProduct(String owner) {
        System.out.println("创建" + owner + "的ID卡");
        return new IDCard(owner, serial++);
    }

    @Override
    public void registerProduct(Product product) {
        IDCard card = (IDCard) product;
        dataBase.put(card.getSerial(), card.getOwner());
    }

    public Map getDataBase() {
        return dataBase;
    }
}
