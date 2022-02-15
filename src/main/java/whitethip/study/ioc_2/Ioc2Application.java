package whitethip.study.ioc_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
@EnableAsync
public class Ioc2Application {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Ioc2Application.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }
}
