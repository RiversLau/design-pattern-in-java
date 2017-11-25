package pattern22_command;

import java.util.Iterator;
import java.util.Stack;

/**
 * Author: Rivers
 * Date: 2017/11/25 15:55
 */
public class MacroCommand implements Command {

    private Stack history = new Stack();

    @Override
    public void execute() {
        Iterator it = history.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }

    public void append(Command command) {
        if (command != this) {
            history.push(command);
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.pop();
        }
    }

    public void clear() {
        history.clear();
    }
}
