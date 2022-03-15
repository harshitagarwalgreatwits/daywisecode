package com.hibernatecore.Fetchdata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Feachhingdata {
	public static void main(String bb[]) {
		
		Configuration cfg=new Configuration();
		cfg.configure("Configuration.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student s1=(Student)session.get(Student.class, 1);
		System.out.println(s1.getCourse());
		System.out.println(s1.getName());
		session.close();
		factory.close();
		
		
		
	}
	
	

}
