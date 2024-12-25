package com.restaurant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RestaurantApplication {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Restaurant.class);
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	System.out.println(4);
	Session session=sessionFactory.openSession();
	Restaurant r=new Restaurant("Sukhada",3,"Mumbai",2660);
    session.save(r);
    session.beginTransaction().commit();
}
}
