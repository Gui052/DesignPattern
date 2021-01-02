package cn.itailan.serviceprovider.frame;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 提供者注册API
 */
//Instantiable class for service registration and access
public class ServiceManager {

    //Prevents instantiation
    private ServiceManager() {
    }

    //Maps service names to services
    private static final Map<String, ServiceProvider> providers = new ConcurrentHashMap<>();

    public static final String DEFAULT_PROVIDER_NAME = "def";

    //Provider registration API
    public static void registDefaultProvider(ServiceProvider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, ServiceProvider p) {
        providers.put(name, p);
    }

    //ServiceInterface access API
    public static ServiceInterface newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static ServiceInterface newInstance(String name) {
        ServiceProvider p = providers.get(name);
        if (null == p) {
            throw new IllegalArgumentException("No provider registered with name " + name);
        }
        return p.newService();
    }
}
