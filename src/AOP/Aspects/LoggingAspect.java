package AOP.Aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
/*
    @Pointcut("execution(* AOP.*.*(..))")
    private void AllMethods() {}

    @Pointcut("execution(* AOP.*.returnMagazine(..))")
    private void returnMagazine() {}

    @Before("AllMethods() && !returnMagazine()")
    public void allMethodsException() {
        System.out.println("log: All methods except returnMagazine");
    }*/
/*

    @Pointcut("execution(* AOP.*.get*(..))")
    private void getMethods() {}

    @Pointcut("execution(* AOP.*.return*(..))")
    private void returnMethods() {}

    @Pointcut("execution(* AOP.*.add*(..))")
    private void addMethods() {}


    @Pointcut("getMethods() || returnMethods()")
    private void add_returnMethods() {}


    @Before("add_returnMethods()")
    public void beforeGetReturnAdvice() {
        System.out.println("log: try to get or return");
    }
*/

    @Before("AOP.Aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLogAdvice() {
        System.out.println("- log: try to get something");
    }

}











