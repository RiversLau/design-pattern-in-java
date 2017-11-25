package pattern23_interpreter;

import java.util.ArrayList;

/**
 * Author: Rivers
 * Date: 2017/11/25 16:52
 */
public class CommandListNode extends Node {

    private ArrayList list = new ArrayList();
    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing End");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }

    public String toString() {
        return list.toString();
    }
}
