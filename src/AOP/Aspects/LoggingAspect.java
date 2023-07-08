package AOP.Aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("log: try to get a book");
    }

}
