package exer1;

public class student extends person {
	int sID;
	int classNo;
	
	
	public student(String name, char sex, int age) {
		super(name, sex, age);
	}
	public void setData(String name, char sex, int age,int sID,int classNo){
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.sID=sID;
		this.classNo=classNo;
	}
	public void getData(){
		System.out.print(name+" "+sex+" "+age+" "+sID+" "+classNo);
	}
}
