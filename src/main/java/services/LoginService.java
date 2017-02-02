package services;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import bean.Account;

@SuppressWarnings("deprecation")
public class LoginService
{
	public boolean authenticateAccount(String login, String password)
	{
		Account account = getAccountByLogin(login);
		
		if (account != null && account.getLogin().equals(login) && account.getPassword().equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Account getAccountByLogin(String login)
	{
		Account account = null;
		
		try
		{
			Configuration configuration = new Configuration().configure();
			SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = null;
			transaction = session.getTransaction();
			transaction.begin();
			
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery("from Account where login='"+login+"'");
			
			account = (Account)query.uniqueResult();
			transaction.commit();
			session.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return account;
	}
	
	@SuppressWarnings("unchecked")
	public List<Account> getListOfAccounts()
	{
		List<Account> list  = new ArrayList<Account>();
		Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
		Transaction transaction = null;
		
		try
		{
			transaction = session.beginTransaction();
			transaction.begin();
			
			list = session.createQuery("from accounts").list();
			
			transaction.commit();
		}
		catch (Exception ex)
		{
			if (transaction != null)
			{
				transaction.rollback();
			}
			ex.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return list;
	}
}
