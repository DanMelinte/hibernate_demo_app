package AOP.Aspects;


import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;

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

    @AfterReturning(pointcut = "execution(* getBookList())",
        returning = "books")
    public void afterGetBook(List<Book> books) {
        System.out.println("- log: get book list successfully");

        books.sort(((o1, o2) -> o2.getName().compareTo(o1.getName())));
        System.out.println(books);
    }

    @AfterThrowing(pointcut = "execution(* get*())",
            throwing = "exception")
    public void afterGetBookException(Throwable exception) {
        System.out.println("- exp: Exception throw");

        System.out.println(exception.getMessage());
    }

    /*@Before("AOP.Aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLogAdvice(JoinPoint joinPoint) {
        System.out.println("- log: try to get");
        System.out.println("JoinPoint:");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("ms : " + methodSignature);
        System.out.println("ms : " + methodSignature.getMethod());
        System.out.println("ms : " + methodSignature.getReturnType());
        System.out.println("ms : " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (var obj: arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(myBook.toString());
                }
                else
                    System.out.println(obj.toString());
            }
        }
    }*/
}











