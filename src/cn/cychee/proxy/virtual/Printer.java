package cn.cychee.proxy.virtual;

/**
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/16 11:34 下午
 */
public class Printer implements Printable{
    private String name;

    public Printer() {
        heavyJob("Printer实例生成中");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer实例生成中(" + name + ")");
    }

    /**
     * 干活5秒
     * @param msg
     */
    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("结束");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("====" + name + "====");
        System.out.println(string);
    }
}
