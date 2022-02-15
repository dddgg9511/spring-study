package whitethip.study.ioc_2;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {

        //Converter 등록
        //registry.addConverter(new EventConverter.StringToEventConverter());

        //Formater 등록
        registry.addFormatter(new EventFormatter());
    }
}
