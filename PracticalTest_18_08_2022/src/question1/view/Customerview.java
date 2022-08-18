package question1.view;

import question1.model.Customer;
import question1.service.Customerservice;

public class Customerview {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Customer obj=new Customer();
		Customer obj2=new Customer(6,"samir",22);
		
		Customerservice obj3=new Customerservice();
		
		boolean b=obj3.checkElligibility(obj2);
		if(b==true) {
			System.out.println("You are Eligible for voting");
		}
		else{
		System.out.println("you are not Eligible for voting");
		}
			
		

	}

}
