package domain;

public class Architect extends Designer {
	private int stock;
	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, equipment equipments, double bonus, int stock) {
		super(id, name, age, salary, equipments, bonus);
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	public String toString() {	
		return getDetails()+"\t架构师\t"+getStatus()+"\t"+getBonus()+"\t"+stock+"\t"+getEquipments().getDescription();
	}
	public String getDetailsForTeam() {
		return getMenberID()+"/"+getId()+"\t"+getName()+"\t"+getAge()+"\t"+getSalary()+"\t架构师\t"+getBonus()+"\t"+getStock();
	}
	
	
}
