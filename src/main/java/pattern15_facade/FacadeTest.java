package pattern15_facade;

import java.io.IOException;

/**
 * Author: Rivers
 * Date: 2017/11/23 06:08
 */
public class FacadeTest {

    public static void main(String[] args) throws IOException {
        PageMaker.makeWelcomePage("tomura@hyuki.com", "tomura_welcome.html");
    }
}
