package pattern14_chain_responsibility;

/**
 * Author: Rivers
 * Date: 2017/11/22 21:45
 */
public class LimitSupport extends Support {

    private int limit;
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
