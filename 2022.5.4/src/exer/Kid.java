package exer;

public class Kid extends manKind{
	private int age;
	
	public Kid() {
	}


	public Kid(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printAge() {
		System.out.println("I am "+age+" years old");
	}
}
