package pattern14_chain_responsibility;

/**
 * Author: Rivers
 * Date: 2017/11/22 21:48
 */
public class SpecialSupport extends Support {

    private int number;
    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }
}
