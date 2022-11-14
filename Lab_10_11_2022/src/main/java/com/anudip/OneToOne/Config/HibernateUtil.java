package com.anudip.OneToOne.Config;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.anudip.OneToOne.entity.Car;
import com.anudip.OneToOne.entity.Customer;



public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Properties settings;
		
		public static SessionFactory getSessionFactory() {
			if(sessionFactory == null) {
				try {
					Configuration configuration=new Configuration();
					Properties settings = new Properties();
					
					settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
					settings.put(Environment.URL, "jdbc:mysql://localhost:3306/samir");
					settings.put(Environment.USER, "root");
					settings.put(Environment.PASS, "Password@123");
					settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");

					settings.put(Environment.SHOW_SQL, "true");

					settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

					settings.put(Environment.HBM2DDL_AUTO, "update");
	                settings.put(Environment.ENABLE_LAZY_LOAD_NO_TRANS,"true");
	                  
					configuration.setProperties(settings);
					configuration.addAnnotatedClass(Car.class);
					configuration.addAnnotatedClass(Customer.class);
					
					ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties()).build();
					System.out.println("Hibernate Java Config serviceRegistry created");
					sessionFactory = configuration.buildSessionFactory(serviceRegistry);
					return sessionFactory;

				} catch (HibernateException e) {
					e.printStackTrace();
				}
			}
			return sessionFactory;
		}

		public static Session getSession()
		 {
			 return getSessionFactory().openSession(); 
		 }


}
