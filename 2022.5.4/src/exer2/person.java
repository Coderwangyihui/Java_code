package exer2;

public class person {
	String name;
	char sex;
	int age;
	public void setData(String name,char sex,int age) {
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	public String getDetail() {		
		return name+" "+sex+" "+age;
	}
}
