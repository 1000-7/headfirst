package headfirst.proxy.HelpProxy;

import java.lang.reflect.Proxy;

public class PersonProxyIntegration{

    public PersonBean getOwnerProxy(PersonBean person) {//设置Owner代理
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {//设置非Owner代理
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
