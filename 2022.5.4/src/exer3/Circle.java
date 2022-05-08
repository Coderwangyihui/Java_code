package exer3;

public class Circle extends V {
	double r;
	public Circle(double r) {
		this.r=r;
		sort="Circle";
		length=length() ;
		area=erea();
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	public double length() {
		return 2*r*Math.PI;
	}
	public double erea() {
		return Math.PI*r*r;
	}
}
