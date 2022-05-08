package exer;

public class customer {
	public account getP() {
		return p;
	}
	public void setP(account p) {
		this.p = p;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	private String firstname;
	private String lastname;
	private account p;
	public customer(String firstname,String lastname) {  
		this.firstname=firstname;
		this.lastname=lastname;
	}
}
