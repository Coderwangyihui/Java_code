package exer2;

public class student extends person{
	public int sID;
	public String speciality;
	public void setData(String name,char sex,int age,int sID,String speciality) {
		this.sex = sex;
		this.name = name;
		this.age = age;
		this.sID=sID;
		this.speciality=speciality;
	}
	public String getDetail() {		
		return name+" "+sex+" "+age+" "+sID+" "+speciality;
	}
}
