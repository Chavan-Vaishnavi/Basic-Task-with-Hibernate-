package HibernatePractical1.HibernatePractical1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernatePractical1.HibernatePractical1.Model.Customer;

public class App 
{
    public static void main( String[] args )
    {
        //step1
    	
    	Configuration con=new Configuration();
    	con.configure("/HibernatePractical1/HibernatePractical1/Configuration/hibernate.cfg.xml");
    	
    	//step2
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	//step3
    	
    	Session ss=sf.openSession();
    	
    	//step4
    	
    	/*Customer c1=new Customer();
    	c1.setCid(105);
    	c1.setCname("Gatha");
    	c1.setCemail("gatha@gmail.com");
    	c1.setCphone("8765432191");*/
    	
    	/*List<Customer> l1=ss.createQuery("FROM Customer").list(); //fetch all records
    	System.out.println(l1);*/
    	
    	/*Customer cp=ss.get(Customer.class, 102);  //fetch record by id
    	System.out.println(cp);*/
    	
    	/*Customer cp=ss.get(Customer.class,105); //delete record by id
    	ss.delete(cp);*/
    	
    	Customer cp=ss.get(Customer.class, 102);  //updata record with id
    	cp.setCemail("tirtha11@gmail.com");   	  
    	ss.update(cp);
    	
    	//step5
    	
    	//ss.save(c1);
    	
    	ss.beginTransaction().commit();
    	//System.out.println("Record Saved");
    			
    }
}
