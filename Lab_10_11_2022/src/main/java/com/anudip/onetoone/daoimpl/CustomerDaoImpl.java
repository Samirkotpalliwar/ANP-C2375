package com.anudip.onetoone.daoimpl;

import java.util.Iterator;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session
;
import org.hibernate.Transaction;


import com.anudip.onetoone.config.HibernateUtil;
import com.anudip.onetoone.dao.CustomerDao;
import com.anudip.onetoone.entity.Customer;
import com.anudip.onetoone.entity.Shop;

public class CustomerDaoImpl implements CustomerDao {
	public void insert() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx= session.beginTransaction();
			Customer cus=new Customer();
			cus.setId(101);
			cus.setName("samir");
			cus.setEmail("samirkotpalliwar@gmail.com");
			cus.setPhone(800736553);
			cus.setAddress("Main road Gondpipri");
			
			Shop s=new Shop();
			s.setId(102);
			s.setName("Grocery Store");
			s.setAddress("Main road Gondpipri");
			s.setType("Grocery");
			s.setPhoneNo(930959984);
			
			cus.setSh(s);
			session.save(cus);
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
				System.out.println(cus.getName()+" "+cus.getPhone());
				Shop sh=cus.getSh();
				System.out.println(sh.getType()+" "+sh.getAddress());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
