package whitethip.study.ioc_2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("execution(* whitethip..*.EventService.*(..))")
    //@Around("@annotation(PerfLogging)")
    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pic) throws Throwable{
        long begin = System.currentTimeMillis();
        Object retVal = pic.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello(){
        System.out.println("hello");
    }
}
