package pattern12_decorator;

/**
 * Author: Rivers
 * Date: 2017/11/21 21:41
 */
public abstract class Border extends Display {

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
