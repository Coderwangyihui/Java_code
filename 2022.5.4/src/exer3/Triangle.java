package exer3;

public class Triangle extends V{
	public double a;
	public Triangle (double a) {
		this.a=a;
		sort="Triangle";
		length=length() ;
		area=erea();
	}
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
	public double length() {
		return 3*a;
	}
	public double erea() {
		return Math.sqrt(3)*a*a/4;
	}
}
