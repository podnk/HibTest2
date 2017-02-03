package dao;

import javax.servlet.http.HttpServlet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import bean.Account;
 
public class AccountDAO extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	static Configuration configuration = new Configuration().configure();
	static SessionFactory sessionFactory = configuration.buildSessionFactory();
	static Session session = sessionFactory.openSession();
	static Transaction transaction = session.beginTransaction();

	public void addAccountDetails(String login, String password, String email,
            String name, String surname) 
    {
        try 
        {
            Account account = new Account();
            account.setLogin(login);
            account.setPassword(password);
            account.setEmail(email);
            account.setName(name);
            account.setSurname(surname);
            
            session.save(account);
            transaction.commit();
            
            System.out.println("\n\n Details Added \n");
        }
        catch (Exception ex) 
        {
            System.out.println(ex);
        }
        finally
        {
        	session.close();
        	sessionFactory.close();
		}
 
    }
 
}