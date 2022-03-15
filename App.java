package com.hibernatecore.MANYTOMANY.LearnManytoMany;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("Configuration.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	Emp e1=new Emp();
    	Emp e2=new Emp();
    	e1.setEid(1);
    	e1.setName("HARSHIT");
    	e2.setEid(2);
    	e2.setName("Shayam");
    	Project p1=new Project();
    	Project p2=new Project();
    	p1.setPid(12);
    	p1.setProjectname("Lib Management");
    	p2.setPid(13);
    	p2.setProjectname("Chatt Boot");
    	
    	List<Emp> list1=new ArrayList<Emp>();
    	List<Project> list2=new ArrayList<Project>();
    	list1.add(e1);
    	list1.add(e2);
    	list2.add(p1);
    	list2.add(p2);
    	e1.setProjects(list2);
    	e2.setProjects(list2);
    	p1.setEmps(list1);
    	p2.setEmps(list1);
    	Session s=factory.openSession();
    	Transaction tx=s.beginTransaction();
    	s.save(e1);
    	s.save(e2);
    	s.save(p1);
    	s.save(p2);
    	tx.commit();
    	s.close();
    	factory.close();
    	
    	
       
    }
}
