package headfirst.proxy.aop.two;

import headfirst.proxy.aop.first.Level;
import headfirst.proxy.aop.first.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHello implements InvocationHandler {

    /**
     * 要处理的对象(也就是我们要在方法的前后加上业务逻辑的对象,如例子中的Hello)
     */
    private Object delegate;

    /**
     * 动态生成方法被处理过后的对象 (写法固定)
     *
     * @param delegate
     * @return 这个地方在被使用的时候一定要是一个接口类型，getInterfaces决定的
     */
    public Object bind(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(
                this.delegate.getClass().getClassLoader(), this.delegate
                        .getClass().getInterfaces(), this);
    }

    /**
     * 要处理的对象中的每个方法会被此方法送去JVM调用,也就是说,要处理的对象的方法只能通过此方法调用
     * 此方法是动态的,不是手动调用的
     * 具体参加博客https://www.unclewang.info/note/headfirst/545/ 的保护代理那部分
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result = null;
        try {
            //执行原来的方法之前记录日志
            Logger.logging(Level.DEBUG, method.getName() + " Method start.");

            //JVM通过这条语句执行原来的方法(反射机制)
            result = method.invoke(this.delegate, args);
            //执行原来的方法之后记录日志
            Logger.logging(Level.INFO, method.getName() + " Method end!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回方法返回值给调用者

        return result;
    }
}
