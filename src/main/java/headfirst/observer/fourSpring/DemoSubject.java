package headfirst.observer.fourSpring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by MyWorld on 2016/7/31.
 */
@Component
public class DemoSubject implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher eventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.eventPublisher = applicationEventPublisher;
    }

    public void publish() {
        eventPublisher.publishEvent(new DemoEvent("Hello world!"));
    }
}
