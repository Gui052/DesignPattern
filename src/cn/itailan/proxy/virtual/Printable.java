package cn.itailan.proxy.virtual;

/**
 * 确保代理和被代理对象一致性
 *
 * @author Mr.Lan
 * @version 1.0.0
 * @since 2020/6/16 11:27 下午
 */
public interface Printable {

    void setPrinterName(String name);

    String getPrinterName();

    void print(String string);
}
