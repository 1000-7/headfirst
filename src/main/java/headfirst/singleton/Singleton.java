package headfirst.singleton;

class Singleton {
    //volatile关键词确保，当singleton变量被初始化成Singleton实例时，多个线程正确处理singleton变量
    private volatile static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //如果不存在，就进入同步区块
        if (singleton == null) {
            //只有第一次才彻底执行这里的代码
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
