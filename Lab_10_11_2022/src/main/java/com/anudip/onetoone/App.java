package com.anudip.onetoone;

import com.anudip.onetoone.daoimpl.CustomerDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CustomerDaoImpl customerDaoImpl=new CustomerDaoImpl();
        customerDaoImpl.read();
        
        customerDaoImpl.insert();
    }
}
