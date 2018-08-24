package headfirst.singleton_pattern.one;

class SingletonFast {
    private static SingletonFast singleton = new SingletonFast();

    private SingletonFast() {
    }

    public static SingletonFast getInstance() {
        return singleton;
    }
}
