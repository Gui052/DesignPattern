package cn.itailan.serviceprovider.thirdpackage;

import cn.itailan.serviceprovider.frame.ServiceInterface;
import cn.itailan.serviceprovider.frame.ServiceManager;
import cn.itailan.serviceprovider.frame.ServiceProvider;

public class EntityProvider implements ServiceProvider {

    static {
        ServiceManager.registerProvider("ServiceInterfaceImpl",new EntityProvider());
    }

    @Override
    public ServiceInterface newService() {
        return new ServiceInterfaceImpl();
    }
}
