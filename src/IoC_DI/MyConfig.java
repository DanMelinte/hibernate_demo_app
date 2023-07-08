package IoC_DI;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan("main")
@PropertySource("classpath:valuesFile.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet cattBean() {
        return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Person personBeanC() {
        return new Person(cattBean());
    }
}
