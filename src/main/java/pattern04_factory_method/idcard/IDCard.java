package pattern04_factory_method.idcard;

import pattern04_factory_method.framework.Product;

/**
 * Author: Rivers
 * Date: 2017/11/18 11:17
 */
public class IDCard extends Product {

    private String owner;
    private Integer serial;

    IDCard(String owner, Integer serial) {
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("----使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public Integer getSerial() {
        return serial;
    }
}
