package headfirst.proxy.aop.three;

import headfirst.proxy.aop.first.Level;
import headfirst.proxy.aop.first.Logger;

import java.lang.reflect.Method;

public class LoggerOperation implements IOperation {
    @Override
    public void end(Method method) {
        Logger.logging(Level.DEBUG, method.getName() + " Method end .");
    }

    @Override
    public void start(Method method) {
        Logger.logging(Level.INFO, method.getName() + " Method Start!");
    }


}

