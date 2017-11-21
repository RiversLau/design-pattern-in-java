package pattern12_decorator;

/**
 * Author: Rivers
 * Date: 2017/11/21 21:52
 */
public class DirectorTest {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello design patter");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);

        d1.show();
        d2.show();
        d3.show();

        Display d4 = new SideBorder(
                new FullBorder(
                            new FullBorder(
                                    new SideBorder(
                                            new FullBorder(
                                                    new StringDisplay("你好，世界")), '*'))), '/');
        d4.show();
    }
}
