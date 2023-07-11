package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        /*Book book = context.getBean("book", Book.class);
        UPTLibrary library1 = context.getBean("uptLibrary", UPTLibrary.class);
        library1.addBook("Dan", book);
        System.out.println("=====================================");
        library1.addMagazine();*/
        /*UVTLibrary library2 = context.getBean("uvtLibrary", UVTLibrary.class);
        library2.getMagazine();*/

        UPTLibrary library1 = context.getBean("uptLibrary", UPTLibrary.class);
        library1.addSomeStudents();
        library1.getBookList();


        try {
            library1.getBookException();
        }catch (IndexOutOfBoundsException e) {
            System.out.println(".....");
        }

        context.close();
    }
}
