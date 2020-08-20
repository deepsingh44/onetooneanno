package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");

		SessionFactory sf = c.buildSessionFactory();

		Session session = sf.openSession();

		Student std = session.get(Student.class, 2);
		System.out.println(std.getName() + "\t" + std.getAddress().getName());

	}
}
