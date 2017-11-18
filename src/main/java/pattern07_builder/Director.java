package pattern07_builder;

/**
 * Author: Rivers
 * Date: 2017/11/18 17:28
 */
public class Director {

    private Builder builder;
    public Director(Builder aBuilder) {
        this.builder = aBuilder;
    }

    public void construct() {
        builder.buildTitle("Greeting");
        builder.buildString("从早上到下午");
        builder.buildItems(new String[]{
                "早上好",
                "下午好"
        });
        builder.buildString("晚上");
        builder.buildItems(new String[] {
                "晚上好",
                "晚安",
                "再见"
        });
        builder.buildDone();
    }
}
