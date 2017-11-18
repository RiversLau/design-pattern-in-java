package template_method_pattern;

/**
 * Author: Rivers
 * Date: 2017/11/18 10:36
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('R');
        display.display();

        System.out.println();

        display = new StringDisplay("Hello, World.");
        display.display();

        display = new StringDisplay("设计模式");
        display.display();
    }
}
