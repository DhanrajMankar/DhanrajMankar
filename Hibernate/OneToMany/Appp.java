package JDBCmaven.onetoone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory s = new Configuration().configure().buildSessionFactory();
    	Session ses = s.openSession();
    	Transaction t  = ses.beginTransaction();
    	
    	Employee e = new Employee();
    	e.setId(1);
    	e.setName("Dhanraj");
    	
    	Address a = new Address();
    	a.setAid(2);
    	a.setCity("Rajkhed");
    	a.setCountry("India");
    	a.setState("Maharatra");
    	a.setPincode(444);
    	a.setHouse("A402");
    	
    	
    	e.setAddress(a);
    	ses.save(e);
    	t.commit();
    
    	
    	s.close();
    	ses.close();
    }
}
