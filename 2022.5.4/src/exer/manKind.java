package exer;

public class manKind{
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	private int salary;
	private int sex;
	
	public manKind(int salary, int sex) {
		
		this.salary = salary;
		this.sex = sex;
	}
	public manKind() {

	}
	public void manOrwoman() {
		if(sex==1)
			System.out.println("man");
		System.out.println("woman");
	}
	public void employeed() {
		System.out.println((salary==0)?"no job":"job");
	}
}
