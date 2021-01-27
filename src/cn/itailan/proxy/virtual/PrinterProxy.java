package cn.itailan.proxy.virtual;

/**
 * 代理
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/16 11:44 下午
 */
public class PrinterProxy implements Printable {
    //名字
    private String name;

    //"本人"
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

    /**
     * 将耗时的生成实例操作移到print方法调用的时候才做
     */
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    //生成"本人"
    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
