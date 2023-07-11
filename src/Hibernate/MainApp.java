package Hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("Hibernate/hibernate.config.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//insert - save
/*            Employee emp = new Employee("aaaa", "aaaa", "HR", 2500);
            session.save(emp);*/

//select - get by id
/*            Employee employee = session.get(Employee.class, 3);
            System.out.println(employee);*/

//select - get by different param
/*            List<Employee> emps = session.createQuery("from Employee where name='Dan' and salary>2000") //hql (Employee - class NOT Table)
                    .getResultList();*/

//update
/*            Employee employee = session.get(Employee.class, 1);
            employee.setSalary(3000);*/

/*            session.createQuery("update Employee set name='Vlad' where id=3").executeUpdate();*/

//delete
            /*session.delete(session.get(Employee.class, 3));*/
            session.createQuery("delete Employee where name='aaaa'").executeUpdate();



            session.getTransaction().commit(); // .rollback
        } finally {
            factory.close();
        }
    }
}
