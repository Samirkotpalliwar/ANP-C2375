package com.anudip.Onetoone;

import com.anudip.Onetoone.daoImpl.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDaoImpl edao=new EmployeeDaoImpl();
    	edao.addEmployee();
    	//edao.fetchEmployee();
    }
}
