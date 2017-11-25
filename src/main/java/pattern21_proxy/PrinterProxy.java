package pattern21_proxy;

/**
 * Author: Rivers
 * Date: 2017/11/25 15:21
 */
public class PrinterProxy implements Printable {

    private String name;
    private Printer real;
    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    public synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
