package IoC_DI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Person person1 = context.getBean("personBean", Person.class);
        //System.out.println(person1.toString());


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Person p = context.getBean("personBeanC", Person.class);
        System.out.println(p);

        context.close();
    }
}
