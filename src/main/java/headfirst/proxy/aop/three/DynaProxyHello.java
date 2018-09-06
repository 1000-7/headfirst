package headfirst.proxy.aop.three;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHello implements InvocationHandler {
    private Object proxy;
    private Object delegate;

    /**
     * @param delegate
     * @param proxy
     * @return
     */
    public Object bind(Object delegate, Object proxy) {
        this.proxy = proxy;
        this.delegate = delegate;
        return Proxy.newProxyInstance(
                this.delegate.getClass().getClassLoader(), this.delegate
                        .getClass().getInterfaces(), this);
    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     * 日志的部分全部都用this.proxy，就是LoggerOperation
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        Class c = this.proxy.getClass();
        Method start = c.getDeclaredMethod("start", method.getClass());
        Method end = c.getDeclaredMethod("end", method.getClass());
        start.invoke(this.proxy, method);
        result = method.invoke(delegate, args);
        end.invoke(this.proxy, method);
        return result;
    }
}
