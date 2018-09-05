package headfirst.singleton.one;

class SingletonFast {
    private static SingletonFast singleton = new SingletonFast();

    private SingletonFast() {
    }

    public static SingletonFast getInstance() {
        return singleton;
    }
}
