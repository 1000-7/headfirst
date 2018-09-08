package headfirst.observer.fourSpring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoObserver1 implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        System.out.println(this.getClass().getCanonicalName() + " receive: " + demoEvent.getSource());
    }
}