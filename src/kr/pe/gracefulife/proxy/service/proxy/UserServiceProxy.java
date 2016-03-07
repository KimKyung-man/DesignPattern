package kr.pe.gracefulife.proxy.service.proxy;

import kr.pe.gracefulife.proxy.service.UserService;
import kr.pe.gracefulife.proxy.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 매우매우 약식 Dynamic Proxy 클래스
 * 어노테이션으로 DI 까지 해보면 재미있을 듯
 * <p>
 * Created by Gracefulife on 2016-03-07.
 */
public class UserServiceProxy implements InvocationHandler {
    private Object target = null;


    public void setTarget(Object target_) {
        this.target = target_;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println("Before proxy : " + method.getName());
            Object reference = method.invoke(target, args);
            System.out.println("After proxy : " + method.getName());
            return reference;
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }
}
