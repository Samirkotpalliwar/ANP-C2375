package com.anudip.hybernateExanple;


import com.anudip.hybernateExample.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.anudip.hybernateExample.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        
        Session ses=factory.openSession();
        
       Transaction t= ses.beginTransaction();
        
        Student s=new Student();
        s.setSid(101);
        s.setSname("samir");
        s.setSemail("samirkotpalliwar6917@gmail.com");
        s.setSage(20);
        s.setSedu("BE");
        s.setSphone(800736553);
        
        ses.save(s);
        
        t.commit();
        System.out.println("Inserted Successfully");
        
        ses.close();
        
    }
}
