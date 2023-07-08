package IoC_DI;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat : " + this + " created");
    }



    @Override
    public void say() {
        System.out.println("Mew-Mew");
    }

}
