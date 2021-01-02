package cn.itailan.serviceprovider.thirdpackage;

import cn.itailan.serviceprovider.frame.ServiceInterface;

/**
 * 服务接口实现
 */
public class ServiceInterfaceImpl implements ServiceInterface {
    @Override
    public void server() {
        System.out.println("This is ServiceInterfaceImpl");
    }
}
