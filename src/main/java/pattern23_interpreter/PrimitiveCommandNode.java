package pattern23_interpreter;

/**
 * Author: Rivers
 * Date: 2017/11/25 17:03
 */
public class PrimitiveCommandNode extends Node {

    private String name;
    @Override
    public void parse(Context context) throws ParseException {
        name = context.currentToken();
        context.skipToken(name);
        if (!name.equals("go") && !name.equals("right") && !name.equals("left")) {
            throw new ParseException(name + " is undefined!");
        }
    }

    public String toString() {
        return name;
    }
}
