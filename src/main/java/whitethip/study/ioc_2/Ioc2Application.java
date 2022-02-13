package whitethip.study.ioc_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Ioc2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ioc2Application.class, args);
    }

    @Bean
    public MessageSource messageSource(){
        var messageSorce = new ReloadableResourceBundleMessageSource();
        messageSorce.setBasename("classpath:/messages");
        messageSorce.setDefaultEncoding("UTF-8");
        messageSorce.setCacheSeconds(3);
        return messageSorce;
    }

}
