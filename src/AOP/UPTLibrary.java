package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("uptLibrary")
public class UPTLibrary extends AbstractLibrary {
    private List<Book> bookList = new ArrayList<>();

    public void addSomeStudents() {
        Book book1 = new Book("Book4", "Author1", 2000);
        Book book2 = new Book("Book2", "Author2", 2000);
        Book book3 = new Book("Book3", "Author3", 2000);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
    }
    public List<Book> getBookList() {
        System.out.println(bookList);
        return bookList;
    }

    public Book getBookException() {
       return bookList.get(4);
    }

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

    public void addBook(String personName, Book book) {
        System.out.println("add book to UPT");
    }

    public void addMagazine() {
        System.out.println("add magazine to UPT");
    }
}
