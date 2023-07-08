package IoC_DI;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Dog : " + this + " created");
    }


    @PostConstruct
    public void init() {
        System.out.println(this + "init " + Integer.toHexString(System.identityHashCode(this)));
    }

    @PreDestroy
    public void destroy() {
        System.out.println(this + "destroyed " + Integer.toHexString(System.identityHashCode(this)));
    }

    @Override
    public void say() {
        System.out.println("Guf-Guf");
    }
}
