package domain;

public class Designer extends Programmer {
	private double bonus;

	public Designer() {
		super();
	}

	public Designer(int id, String name, int age, double salary, equipment equipments, double bonus) {
		super(id, name, age, salary, equipments);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String toString() {	
		return getDetails()+"\t设计师\t"+getStatus()+"\t"+bonus+"\t\t"+getEquipments().getDescription();
	}
	public String getDetailsForTeam() {
		return getMenberID()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t设计师\t"+getBonus();
	}
	
}
