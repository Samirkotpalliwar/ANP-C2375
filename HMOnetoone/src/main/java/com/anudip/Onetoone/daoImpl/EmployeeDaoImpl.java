package com.anudip.Onetoone.daoImpl;

import java.util.Iterator;

import java.util.List;

import javax.persistence.TypedQuery;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.Onetoone.config.HibernateUtil;
import com.anudip.Onetoone.dao.EmployeeDao;
import com.anudip.Onetoone.entity.AddressProof;
import com.anudip.Onetoone.entity.Employee;


public class EmployeeDaoImpl implements EmployeeDao{
	
	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx= session.beginTransaction();
			Employee emp=new Employee();
			emp.setEname("samir");
			emp.setEmail("samirkotpalliwar@gmail.com");
			emp.setPhone(800736553);
			
			AddressProof a=new AddressProof();
			a.setIdproof(106109);
			a.setType("Aadhaar card");
			a.setAddress("Main road Gondpipri");
			a.setCity("Gondpipri");
			a.setState("Maharashtra");
			
			emp.setAp(a);
			session.save(emp);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}
	

	@Override
	public void fetchEmployee() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			TypedQuery<Employee>query=session.createNamedQuery("from Employee");
			List<Employee>al=query.getResultList();
			
			Iterator<Employee>itr=al.iterator();
			while(itr.hasNext()) {
				Employee emp=itr.next();
				System.out.println(emp.getEname()+" "+emp.getPhone());
				AddressProof ad=emp.getAp();
				System.out.println(ad.getIdproof()+" "+ad.getAddress());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
