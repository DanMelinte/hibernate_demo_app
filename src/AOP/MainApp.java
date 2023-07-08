package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UPTLibrary library1 = context.getBean("uptLibrary", UPTLibrary.class);
        library1.getBook();
        library1.getMagazine();
        library1.returnBook();
        library1.returnMagazine();
        library1.addBook();
        library1.addMagazine();


        //UVTLibrary library2 = context.getBean("uvtLibrary", UVTLibrary.class);
        //library2.getMagazine();

        context.close();
    }
}
