package domain;
import service.Status;

public class Programmer extends Employee{
	private int menberID;//在团队里的ID不是公司的ID
	private Status status= Status.FREE;
	private equipment equipments;
	public Programmer() {
		super();
	}
	public Programmer(int id, String name, int age, double salary, equipment equipments) {
		super(id, name, age, salary);
		this.equipments = equipments;
	}
	public int getMenberID() {
		return menberID;
	}
	public void setMenberID(int menberID) {
		this.menberID = menberID;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public equipment getEquipments() {
		return equipments;
	}
	public void setEquipments(equipment equipments) {
		this.equipments = equipments;
	}
	public String toString() {
		return getDetails()+"\t程序员\t"+status+"\t\t\t"+	equipments.getDescription();
	}
	public String getDetailsForTeam() {
		return menberID+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t程序员";
	}
}
