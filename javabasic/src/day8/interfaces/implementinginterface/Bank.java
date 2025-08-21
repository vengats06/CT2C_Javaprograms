package day8.interfaces.implementinginterface;

public interface Bank {
	double MIN_BALANCE =1000;
	double DEPOSIT_LIMIT=2500;
	double INTEREST_RATE=7.8;
	
	void deposit(Account account,double amount);
	void withdraw(Account account,double amount);


}
