package cn.cychee.serviceprovider.thirdpackage;

import cn.cychee.serviceprovider.frame.ServiceInterface;
import cn.cychee.serviceprovider.frame.ServiceManager;
import cn.cychee.serviceprovider.frame.ServiceProvider;

public class EntityProvider implements ServiceProvider {

    static {
        ServiceManager.registerProvider("ServiceInterfaceImpl",new EntityProvider());
    }

    @Override
    public ServiceInterface newService() {
        return new ServiceInterfaceImpl();
    }
}
