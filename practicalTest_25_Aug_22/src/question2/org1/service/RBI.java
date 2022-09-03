package question2.org1.service;

public abstract class RBI {
      private Customer constomer;
      
       private Account account;
    
         double interestRate;
       
        static final  double minimumInterestRate=4;
       
        static final int minimumBalanced=2000;
       
        static final double maximumWithdraw=45000;
       
       
       
       public abstract double getInterestRate();
       
       public abstract double getWithdrawalLimit();
       
}
