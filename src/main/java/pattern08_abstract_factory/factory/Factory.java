package pattern08_abstract_factory.factory;

/**
 * Author: Rivers
 * Date: 2017/11/19 09:04
 */
public abstract class Factory {

    public static Factory getFactory(String className) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到" + className + "类");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
