package kr.pe.gracefulife.proxy;

import kr.pe.gracefulife.Starter;
import kr.pe.gracefulife.proxy.service.UserService;
import kr.pe.gracefulife.proxy.service.UserServiceImpl;
import kr.pe.gracefulife.proxy.service.UserServiceProxy;
//import kr.pe.gracefulife.proxy.service.dynamic.UserServiceProxy;

import java.lang.reflect.Proxy;

/**
 * @see http://javacan.tistory.com/entry/115
 * Created by Gracefulife on 2016-02-14.
 */
public class ProxyLauncher implements Starter {

    public void start() {
        startProxy();
//        startUseRealSubject();
    }

    private void startProxy() {
        UserService service = new UserServiceProxy(new UserServiceImpl());
        service.findAll();
        service.findById("test");
    }

    private void startUseRealSubject(){
        UserService service = new UserServiceImpl();
        service.findAll();
        service.findById("test");
    }

//    public void startDynamicProxy() {
//        /* Target */
//        UserService service = new UserServiceImpl();
//
//        /* Prepare proxy */
//        UserServiceProxy proxy = new UserServiceProxy();
//        proxy.setTarget(service);
//
//        /* Proxy Object.
//         * 1. Target interface classLoader
//         * 2. Proxy Interface */
//        UserService proxyService = (UserService)
//                Proxy.newProxyInstance(UserService.class.getClassLoader(),
//                        new Class[]{UserService.class}, proxy);
//
//        proxyService.findAll();
//        proxyService.findById("test");
//
//    }

}
