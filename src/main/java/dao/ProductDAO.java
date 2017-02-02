package dao;

import java.math.BigDecimal;
import javax.servlet.http.HttpServlet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import bean.Product;

public class ProductDAO extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void addProductDetails(String title, BigDecimal price) 
    {
        try 
        {
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            
            Product product = new Product();
            product.setTitle(title);
            product.setPrice(price);
            
            session.save(product);
            transaction.commit();
            
            System.out.println("\n\n Details Added \n");
        }
        catch (HibernateException e) 
        {
            System.out.println(e.getMessage());
            System.out.println("error");
        }
 
    }
}
