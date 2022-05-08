package exer1;

public class person {
	public String name;
	public char sex;
	public int age;
	public person(String name, char sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void setData(String name, char sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void getData() {
		System.out.print(name+sex+age);
	}
}
