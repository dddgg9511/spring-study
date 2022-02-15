package whitethip.study.ioc_2;

import org.springframework.aop.TargetSource;

import javax.security.auth.message.MessagePolicy;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface PerfLogging {
}
