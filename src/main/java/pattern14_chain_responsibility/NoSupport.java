package pattern14_chain_responsibility;

/**
 * Author: Rivers
 * Date: 2017/11/22 21:44
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
