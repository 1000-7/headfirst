package headfirst.state_pattern.first;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    int state = SOLD_OUT;
    int count = 0;

    //存储糖果数量
    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    //当有25分钱投入，就会执行这个方法
    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("如果已投入过25分钱，我们就告诉顾客不要再投");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("如果是在“没有25分钱”的状态下，你应该投25分钱");
        } else if (state == SOLD_OUT) {
            System.out.println("如果糖果已经售罄，我们就拒绝收钱");
        } else if (state == SOLD) {
            System.out.println("如果顾客刚才买了糖果，就需要稍等一些，好让状态转换完毕，恢复到“没有25分钱”的状态");
        }
    }

    //先在，如果顾客试着退回25分钱就执行这个方法
    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("如果有25分钱，我们就把钱退出来，回到“没有25分钱”的状态");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.println("如果没有25分钱的话，当然不能退出25分钱");
        } else if (state == SOLD) {
            System.out.println("顾客已经转动曲柄就不能再退钱了，他已经拿到糖果了");
        } else if (state == SOLD_OUT) {
            System.out.println("如果糖果售罄，就不能接受25分钱，当然也不可能退钱");
        }
    }

    //顾客试着转动曲柄
    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("别想骗过机器拿两次糖果");
        } else if (state == NO_QUARTER) {
            System.out.println("我们需要先投入25分钱");
        } else if (state == SOLD_OUT) {
            System.out.println("我们不能给糖果，已经没有任何糖果了");
        } else if (state == HAS_QUARTER) {
            System.out.println("成功，他们拿到糖果了，" + "改变状态到“售出糖果”然后条用机器的dispense()方法");
            state = SOLD;
            dispense();
        }
    }

    //调用此方法，发放糖果
    public void dispense() {
        if (state == SOLD) {
            System.out.println("我们正在”出售糖果“状态，给他们糖果");
            count = count - 1;
            /* 我们在这里处理“糖果售罄的情况，如果这是最后一个糖果，将机器的状态设置到“糖果售罄”” 否则就回到“没有25分钱”的状态 */
            if (count == 0) {
                System.out.println();
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("这些都不应该发生，但是如果做了，就得到错误提示");
        } else if (state == SOLD_OUT) {
            System.out.println("这些都不应该发生，但是如果做了，就得到错误提示");
        } else if (state == HAS_QUARTER) {
            System.out.println("这些都不应该发生，但是如果做了，就得到错误提示");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.count);
    }
}
