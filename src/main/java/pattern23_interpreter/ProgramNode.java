package pattern23_interpreter;

/**
 * Author: Rivers
 * Date: 2017/11/25 16:49
 */
public class ProgramNode extends Node {

    private Node commandListNode;

    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }

    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
