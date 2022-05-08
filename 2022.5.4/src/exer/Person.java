package exer;

public class Person {
	String name;
	int age;
	int sex;
	/**
	 * sex:1 male
	 * sex:0 female
	 */
	public void study(){
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("age:"+age);
	}
	public int addAge(int age) {
		this.age+=age;
		return this.age;
	}
	

}
