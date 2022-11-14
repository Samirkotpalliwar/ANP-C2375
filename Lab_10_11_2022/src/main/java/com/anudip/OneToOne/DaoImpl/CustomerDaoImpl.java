package com.anudip.OneToOne.DaoImpl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.OneToOne.Config.HibernateUtil;
import com.anudip.OneToOne.Dao.CustomerDao;
import com.anudip.OneToOne.entity.Car;
import com.anudip.OneToOne.entity.Customer;



public class CustomerDaoImpl implements CustomerDao{
	
	public void insert() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx= session.beginTransaction();
			Customer cus=new Customer();
			cus.setCusId(101);
			cus.setCusName("samir");
			cus.setAddress("Main road gondpipri");
			cus.setEmail("samirkotpalliwar@gmail.com");
			cus.setPhone(800736553);
			
			Car c=new Car();
			c.setModelNo(345);
			c.setCarName("Indigo");
			c.setCarColour("white");
			c.setCarCompany("Tata");
			c.setCarfeatures("Electrical");
			
			
			cus.setCa(c);
			session.save(cus);
			session.save(c);
			tx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
			
	}
	public void read() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			TypedQuery<Customer>query=session.createNamedQuery("from Customer");
			List<Customer>al=query.getResultList();
			
			Iterator<Customer>itr=al.iterator();
			while(itr.hasNext()) {
				Customer cus=itr.next();
				System.out.println(cus.getCusName()+" "+cus.getPhone());
				Car ca=cus.getCa();
				System.out.println(ca.getModelNo()+" "+ca.getCarCompany());
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		}
	
	}
	
	
