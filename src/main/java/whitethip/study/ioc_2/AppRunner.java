package whitethip.study.ioc_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext ctx;

    @Autowired
    MessageSource messageSource;

    @Autowired
    ApplicationEventPublisher publishEvent;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        publishEvent.publishEvent(new MyEvent(this, 100));
    }
}
