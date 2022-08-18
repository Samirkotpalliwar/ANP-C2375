package question1.service;

import question1.model.Customer;

public class Customerservice {
	public boolean checkElligibility(Customer obj) {
		int a=obj.getConstumerAge();
		if(a>=18) {
			return true;
		}
		return false;
	}

}
