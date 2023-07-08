package AOP.Aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
//    @Before("execution(* get*())")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("sec: try to access");
//    }


}
