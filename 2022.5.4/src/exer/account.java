package exer;

public class account {
	private int id;
	private double balance;
	private double annualInterRate;
	public account(int id,double balance,double annualInterRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterRate = annualInterRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterRate() {
		return annualInterRate;
	}
	public void setAnnualInterRate(double annualInterRate) {
		this.annualInterRate = annualInterRate;
	}
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("withdraw failed");
			return;
		}
		balance-=amount;
		System.out.println("withdraw "+amount);
	}
	public void deposite(int amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposite "+amount);
			return;
		}
	}
}
