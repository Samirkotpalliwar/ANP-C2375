package question1.model;

public class Customer {
	private int customerId;
	private String customerName;
	private int constumerAge;
	
	public Customer(){
		this.customerId=4;
		this.customerName="Samir";
		this.constumerAge=23;
		
	}

	public Customer(int customerId, String customerName, int constumerAge) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.constumerAge = constumerAge;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getConstumerAge() {
		return constumerAge;
	}

	public void setConstumerAge(int constumerAge) {
		this.constumerAge = constumerAge;
	}
	

}
