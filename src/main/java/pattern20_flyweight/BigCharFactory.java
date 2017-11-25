package pattern20_flyweight;

import java.util.HashMap;

/**
 * Author: Rivers
 * Date: 2017/11/25 11:59
 */
public class BigCharFactory {
    private HashMap pool = new HashMap();
    private static BigCharFactory factory = new BigCharFactory();
    private BigCharFactory() {

    }

    public static BigCharFactory getinstance() {
        return factory;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar) pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
