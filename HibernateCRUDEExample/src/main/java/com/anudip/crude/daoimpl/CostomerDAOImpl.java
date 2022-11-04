package com.anudip.crude.daoimpl;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.crude.config.HibernateUtil;
import com.anudip.crude.dao.CustomerDao;
import com.anudip.crude.entity.Customer;


public  class CostomerDAOImpl implements CustomerDao {

	Scanner sc = new Scanner(System.in);

	public void getCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.print("Enter your Customer Id :");
			int id = sc.nextInt();
			sc.nextLine();

			Customer customer = session.get(Customer.class, id);
			System.out.println("---------- Customer Details are ----------");
			System.out.println(customer.getCid() + " " + customer.getCname() + " " + customer.getEmail() + " "
					+ customer.getPhone() + " " + customer.getAdr());

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void addCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			String name, add, email;
			int phone;

			System.out.print("Enter Customer Name :");
			name = sc.nextLine();

			System.out.print("Enter Customer Address :");
			add = sc.nextLine();

			System.out.print("Enter Customer Email :");
			email = sc.nextLine();

			System.out.print("Enter Customer Phone :");
			phone = sc.nextInt();

			Customer customer = new Customer();

			customer.setCname(name);
			customer.setEmail(email);
			customer.setAdr(add);
			customer.setPhone(phone);

			session.save(customer);
			tx.commit();
			System.out.println("* Added Successfully *");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			System.out.print("Enter your customer id :");
			int i = sc.nextInt();
			sc.nextLine();
			Customer cust = session.get(Customer.class, i);
			System.out.print("Enter Phone Number to Update :");
			long ph1 = sc.nextLong();

			cust.setPhone(ph1);

			session.update(cust);

			tx.commit();
			System.out.println("Updated successfully");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			System.out.print("Enter your customer id :");
			int i = sc.nextInt();
			sc.nextLine();
			Customer cust = session.get(Customer.class, i);

			session.delete(cust);

			tx.commit();
			System.out.println("deleted successfully");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void getConstomer() {
		// TODO Auto-generated method stub
		
	}

}