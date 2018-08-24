package headfirst.singleton_pattern.one;

class MyClass {
    private MyClass() {
    }

    public static MyClass getInstance() {
        return new MyClass();
    }
}
