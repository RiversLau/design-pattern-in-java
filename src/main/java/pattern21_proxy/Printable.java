package pattern21_proxy;

/**
 * Author: Rivers
 * Date: 2017/11/25 15:17
 */
public interface Printable {

    void setPrinterName(String name);
    String getPrinterName();

    void print(String string);
}
