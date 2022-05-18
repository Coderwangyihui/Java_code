package domain;

public class Printer implements equipment{
	private String name;
	private String type;
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name+"("+type+")";
	}

	
	public Printer() {
		super();
	}
	public Printer(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
