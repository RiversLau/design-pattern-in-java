package pattern07_builder;

/**
 * Author: Rivers
 * Date: 2017/11/18 17:31
 */
public class TextBuilder extends Builder {

    private StringBuilder builder = new StringBuilder();

    @Override
    public void buildTitle(String tile) {
        builder.append("===========================\n");
        builder.append("【" + tile + "】\n");
        builder.append("\n");
    }

    @Override
    public void buildString(String str) {
        builder.append('#' + str + "\n");
        builder.append("\n");
    }

    @Override
    public void buildItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            builder.append("    ·" + items[i] + "\n");
            builder.append("\n");
        }
    }

    @Override
    public void buildDone() {
        builder.append("===========================\n");
    }

    public String getResult() {
        return builder.toString();
    }
}
