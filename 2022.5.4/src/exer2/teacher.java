package exer2;

public class teacher extends person{
	public int tID;
	public String department;
	public void setData(String name,char sex,int age,int tID,String department) {
		this.sex = sex;
		this.name = name;
		this.age = age;
		this.tID=tID;
		this.department=department;
	}
	public String getDetail() {		
		return name+" "+sex+" "+age+" "+tID+" "+department;
	}
}
