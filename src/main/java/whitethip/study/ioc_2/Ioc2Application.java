package whitethip.study.ioc_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import out.MyService;
import whitethip.study.ioc_2.book.BookRepository;
import whitethip.study.ioc_2.book.BookService;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.function.Supplier;

@SpringBootApplication
public class Ioc2Application {

    @Autowired
    MyService myService;

    public static void main(String[] args) {
//        SpringApplication.run(Ioc2Application.class, args);
        var app = new SpringApplication(Ioc2Application.class);
        app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx ->{
            ctx.registerBean(MyService.class);
            ctx.registerBean(ApplicationRunner.class, () -> args1 -> System.out.println("Funtional Bean Definition!!"));
        });
        app.run(args);

    }

}
