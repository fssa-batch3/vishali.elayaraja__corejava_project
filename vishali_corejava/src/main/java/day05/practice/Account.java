package day05.practice;

//Change the below class to have setters and Getters and Constructors
public class Account {
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	String accNo;
	double balance;

}

//Create an implementation of the below Interface
interface ATM {
	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance();
}

class AxisATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		account.setBalance(amount);
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 5000) {
			throw new Exception("Your balance is below 5000");
		} else {
			byte charge = 5;
			account.setBalance((account.getBalance() - amount) - charge);
			return true;
		}

	}

	@Override
	public double getBalance() {
		return 0;
	}

}

class IciciATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 10000) {
			throw new Exception("Your balance is below 10000");
		} else {
			byte charge = 10;
			account.setBalance((account.getBalance() - amount) - charge);
			return true;
		}

	}

	@Override
	public double getBalance() {
		return 0;
	}

}