package pattern21_proxy;

/**
 * Author: Rivers
 * Date: 2017/11/25 15:24
 */
public class ProxyTest {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("printer name is " + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("printer name is " + p.getPrinterName());
        p.print("Hello Proxy");
    }
}
