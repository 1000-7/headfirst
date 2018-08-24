package headfirst.singleton_pattern.one;

public class SingleCommon {
    private static class SingletonHolder {
        private static final SingleCommon INSTANCE = new SingleCommon();
    }

    public static final SingleCommon getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private SingleCommon() {
        init();
    }

    private void init() {

    }

    public static void main(String[] args) {
        getInstance();
        SingleCommon.getInstance();
    }
}