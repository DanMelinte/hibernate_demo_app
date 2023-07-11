package AOP.Aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(30)
public class ExceptionAspect {

    @Before("AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionAdvice() {
        System.out.println("- exc: handle a exception");
    }
}
