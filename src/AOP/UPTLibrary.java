package AOP;

import org.springframework.stereotype.Component;

@Component("uptLibrary")
public class UPTLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("get book from UPT Library");
    }

    public void getMagazine() {
        System.out.println("get magazine from UPT Library");
    }

    public void returnBook() {
        System.out.println("return book to UPT");
    }

    public void returnMagazine() {
        System.out.println("return magazine to UPT");
    }

    public void addBook() {
        System.out.println("add book to UPT");
    }

    public void addMagazine() {
        System.out.println("add magazine to UPT");
    }
}
