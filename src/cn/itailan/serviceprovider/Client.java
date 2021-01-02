package cn.itailan.serviceprovider;

import cn.itailan.serviceprovider.frame.ServiceInterface;
import cn.itailan.serviceprovider.frame.ServiceManager;

public class Client {
    public static void main(String[] args) throws ClassNotFoundException {

        //实例化提供者实现类，并注册服务
        //对于字节加载到类加载器的过程，主要体现在静态区域的初始化，调用静态区域代码。重载参数false，则不会调用静态块
        Class.forName("cn.itailan.serviceprovider.thirdpackage.EntityProvider");
        ServiceInterface service = ServiceManager.newInstance("ServiceInterfaceImpl");
        service.server();
    }
}
