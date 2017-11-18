package pattern07_builder;

/**
 * Author: Rivers
 * Date: 2017/11/18 17:35
 */
public class BuilderTest {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();

        String textResult = textBuilder.getResult();
        System.out.println(textResult);

        HtmlBuilder htmlBuilder = new HtmlBuilder();
        director = new Director(htmlBuilder);
        director.construct();

        String result = htmlBuilder.getResult();
        System.out.println(result);
    }
}
