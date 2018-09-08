package headfirst.observer.fourSpring;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
    public DemoEvent(Object source) {
        super(source);
    }
}