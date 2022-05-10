package bankManagement.bean;
public class customer {
	private String name;
	private char gender;
	private int age;
	private String tele;
	private String email;
	public customer() {
		super();
	}
	public customer(String name, char gender, int age, String tele, String email) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.tele = tele;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
