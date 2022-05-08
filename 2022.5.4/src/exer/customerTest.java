package exer;

public class customerTest {
	public static void main(String[] args) {
		customer p=new customer("Smith","jane");
		account acct=new account(1000,2000,0.0123);
		p.setP(acct);
		p.getP().deposite(100);
		p.getP().withdraw(960);
		p.getP().withdraw(2000);
	}
}
