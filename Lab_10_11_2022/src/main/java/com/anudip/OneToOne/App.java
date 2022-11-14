package com.anudip.OneToOne;

import com.anudip.OneToOne.DaoImpl.CustomerDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CustomerDaoImpl customerDaoImpl=new CustomerDaoImpl();
	   customerDaoImpl.insert();
	   customerDaoImpl.read();
	}
}
