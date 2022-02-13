package whitethip.study.ioc_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class Ioc2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ioc2Application.class, args);
    }

}
