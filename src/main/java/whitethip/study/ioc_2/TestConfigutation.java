package whitethip.study.ioc_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfigutation {
    @Bean
    public BookRepository bookRepository(){
        return new TestBookRepository();
    }

}
