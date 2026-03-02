import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Ex3 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Product product = new Product("Laptop", 1500);

            session.beginTransaction();

            session.save(product);

            session.getTransaction().commit();

            System.out.println("Lưu thành công!");

        } finally {
            factory.close();
        }
    }
}