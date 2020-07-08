package me.wrallee;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

class SampleStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    // 애플리케이션 컨텍스트가 뜨기 전 이벤트이므로 별도로 리스너 등록을 해 주어야 한다.
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        System.out.println("=======================");
        System.out.println("Application is starting");
        System.out.println("=======================");
    }
}

@Component
class SampleStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    // 그 외에는 bean으로 등록만 해주면 된다.
    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("=======================");
        System.out.println("Application is started!");
        System.out.println("=======================");
    }
}
