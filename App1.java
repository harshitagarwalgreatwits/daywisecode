package com.hibernatecore.Fetchdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("Configuration.cfg.xml").buildSessionFactory();
        Student s1=new Student();
        s1.setRollno(1);
        s1.setName("SHAYAM");
        s1.setCourse("B.Tech");
        Session session=factory.openSession();
        session.beginTransaction();
        session.save(s1);
        session.getTransaction().commit();
        session.close();
        
        
    }
}
