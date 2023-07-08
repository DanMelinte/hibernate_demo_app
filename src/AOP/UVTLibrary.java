package AOP;

import org.springframework.stereotype.Component;

@Component("uvtLibrary")
public class UVTLibrary extends AbstractLibrary {

    public void getMagazine() {
        System.out.println("get Magazine from UVT Library");
    }
}
