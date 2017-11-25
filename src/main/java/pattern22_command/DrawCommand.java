package pattern22_command;

import java.awt.*;

/**
 * Author: Rivers
 * Date: 2017/11/25 15:59
 */
public class DrawCommand implements Command {

    protected Drawable drawable;
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
