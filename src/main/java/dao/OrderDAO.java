package dao;

import java.math.BigDecimal;
import javax.servlet.http.HttpServlet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import bean.Order;

public class OrderDAO extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void addOrderDetails(int orderCount, BigDecimal price, boolean status) 
    {
        try 
        {
            Configuration configuration = new Configuration().configure();
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            
            Order order = new Order();
            order.setOrderCount(orderCount);
            order.setPrice(price);
            order.setStatus(status);
            
            session.save(order);
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
