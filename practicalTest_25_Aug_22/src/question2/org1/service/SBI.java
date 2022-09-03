package question2.org1.service;

public class SBI extends RBI {
	
	public void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}

	@Override
	public double getWithdrawalLimit() {
		// TODO Auto-generated method stub
		return maximumWithdraw;
	}

}
