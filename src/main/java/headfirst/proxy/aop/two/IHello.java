package headfirst.proxy.aop.two;

public interface IHello {
    /**
     * 业务处理A方法
     *
     * @param name
     */
    void sayHello(String name);

    /**
     * 业务处理B方法
     *
     * @param name
     */
    void sayGoogBye(String name);
}

