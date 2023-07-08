package IoC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("personBean")
@Scope("prototype")
public class Person {

    private Pet pet;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("PersonN : " + this + " " + Integer.toHexString(System.identityHashCode(this)) + " created");
    }

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        this.pet = pet;
        System.out.println("PersonW : " + this + " " + Integer.toHexString(System.identityHashCode(this)) + " created");
    }

    public Person(@Qualifier("catBean") Pet pet, String name, int age) {
        this.pet = pet;
        this.name = name;
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("set pet " + Integer.toHexString(System.identityHashCode(this)));
        this.pet = pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void callYourPet() {
        pet.say();
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
