package pattern23_interpreter;

/**
 * Author: Rivers
 * Date: 2017/11/25 16:48
 */
public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
