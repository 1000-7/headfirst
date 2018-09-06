package headfirst.proxy.aop.first;

import java.util.Date;

public class Logger {
    public static void logging(Level level, String context) {
        if (level.equals(Level.INFO)) {
            System.out.println(new Date().toString() + " " + context);
        } else {
            System.out.println(new Date() + "  " + context);
        }
    }
}
