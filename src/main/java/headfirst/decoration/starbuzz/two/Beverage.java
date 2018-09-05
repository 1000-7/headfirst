package headfirst.decoration.starbuzz.two;

public abstract class Beverage {
    protected String description;
    // 是否添加了某些调味料，这里只放两个
    protected boolean soy;
    protected boolean mocha;

    public String getDescription() {
        return this.description;
    }

    // 计算好添加的调味料价格，让子类直接调用
    public float cost() {
        float sum = 0;
        if (hasMocha()) {
            sum += 3.2f;
        }
        if (hasSoy()) {
            sum += 4.6f;
        }
        return sum;
    }

    protected boolean hasMocha() {
        return this.mocha;
    }

    protected void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    protected boolean hasSoy() {
        return this.soy;
    }

    protected void setSoy(boolean soy) {
        this.soy = soy;
    }
}

class Coffee extends Beverage {
    @Override
    public float cost() {
        return super.cost() + 3.2f;
    }
}

/**
 * 现在没有了“类爆炸”，就算调料价格发生变化，只要修改下抽象类就好了，但是真的没问题了吗？
 * 有问题，而且挺多的：
 * 1. 如果出现新的调味料，就需要在抽象类添加新的布尔值成员，cost 方法也需要添加新的判断，还要分别新增一个 setter 和一个 getter，如果是删除一个调味料呢？
 * 2. 对于有些饮料来说，某些调味料并不能加（会拉肚子的！），比如冰红茶 + 牛奶？
 * 3. 如果客户要一杯咖啡，加两份牛奶呢？
 */
