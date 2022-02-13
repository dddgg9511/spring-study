package whitethip.study.ioc_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext ctx;

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {
            System.out.println(messageSource.getClass());
            System.out.println(messageSource.getMessage("greeting", new String[]{"choo"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"choo"}, Locale.ENGLISH));
            Thread.sleep(1000L);
        }

    }
}
