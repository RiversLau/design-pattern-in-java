package pattern14_chain_responsibility;

/**
 * Author: Rivers
 * Date: 2017/11/22 21:46
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        }
        return false;
    }
}
