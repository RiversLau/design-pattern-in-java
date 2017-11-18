package pattern07_builder;

/**
 * Author: Rivers
 * Date: 2017/11/18 17:26
 */
public abstract class Builder {

    private boolean isInitialized = false;

    public void buildTitle(String title) {
        if (!isInitialized) {
            buildTitle(title);
            isInitialized = true;
        }
    }
    public void buildString(String str) {
        if (isInitialized) {
            buildString(str);
        }
    }
    public void buildItems(String[] items) {
        if (isInitialized) {
            buildItems(items);
        }
    }
    public abstract void buildDone();
}
