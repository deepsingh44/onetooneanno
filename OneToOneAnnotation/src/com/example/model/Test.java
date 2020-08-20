package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");

		SessionFactory sf = c.buildSessionFactory();

		Session session = sf.openSession();

		Transaction txt = session.beginTransaction();

		Address a = new Address();
		a.setName("delhi");

		Student s = new Student();
		s.setName("ramesh");

		s.setAddress(a);

		a.setStudent(s);

		session.persist(s);

		txt.commit();
		System.out.println("success");

	}
}
