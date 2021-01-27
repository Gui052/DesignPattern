package cn.itailan.proxy.virtual;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/16 11:53 下午
 */
public class Main {
    public static void main(String[] args) {
        Printable printable = new PrinterProxy("Alice");
        System.out.println("现在的名字是" + printable.getPrinterName());
        printable.setPrinterName("Bob");
        System.out.println("现在的名字是" + printable.getPrinterName());
        printable.print("Hello Word");
    }
}
