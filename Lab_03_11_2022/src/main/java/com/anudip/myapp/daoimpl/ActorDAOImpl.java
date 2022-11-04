package com.anudip.myapp.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.myapp.config.HibernateUtil;
import com.anudip.myapp.dao.ActorDAO;
import com.anudip.myapp.entity.Actor;


public class ActorDAOImpl implements ActorDAO {
	Scanner sc=new Scanner(System.in);
	
	public void getActor() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter Your Actor Id");
			int id=sc.nextInt();
			Actor actor=session.get(Actor.class, id);
			System.out.println("-------Actor Details are--------");
			System.out.println(actor);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void addActor() {
		// TODO Auto-generated method stub
		
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			
			System.out.println("Enter Actor Details");
			System.out.println("Name:");
			String Name=sc.nextLine();
			
			System.out.println("Age:");
			int age=sc.nextInt();
			
			System.out.println("Number:");
			Long number=sc.nextLong();
			sc.nextLine();
			
			System.out.println("Faceshape:");
			String faceshape=sc.nextLine();
			
			System.out.println("Height:");
			float height=sc.nextFloat();
			sc.nextLine();
			
			System.out.println("colour:");
			String colour=sc.nextLine();
			
			Actor actor=new Actor();
			
			actor.setName("samir");
			actor.setAge(23);
			actor.setNumber(number);
			actor.getFaceshape();
			actor.setHeight(height);
			actor.setColour(colour);
			
			session.save(actor);
			tx.commit();
			System.out.println("--------Added Succefully--------");
			
		} catch ( Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public void updateActor() {
		// TODO Auto-generated method stub
		try {
		    Session session=HibernateUtil.getSessionFactory().openSession();
		    Transaction tx=session.beginTransaction();
		    System.out.println("Enter your Actor id");
		    int i=sc.nextInt();
		    sc.nextLine();
		    
		    Actor actor=session.get(Actor.class, i);
		    
		    System.out.println("Enter Your Phone number to update");
		    Long num=sc.nextLong();
		    
		    actor.setNumber(num);
		    
		    session.update(actor);
		    
		    tx.commit();
		    System.out.println("updated successfully");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void deleteActor() {
		// TODO Auto-generated method stub
		try {
			Session session=HibernateUtil.getSessionFactory().openSession();
			Transaction tx=session.beginTransaction();
			System.out.println("Enter Your Actor id:");
			int i = sc.nextInt();
			sc.nextLine();
			Actor actor=session.get(Actor.class, i);
			
			session.delete(actor);
			
			tx.commit();
			System.out.println("Deleted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	}
	
		
	


