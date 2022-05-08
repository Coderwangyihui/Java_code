package exer3;

public class Rectangle extends V {
	double width;
	double Length;
	public Rectangle(double width, double Length) {
		this.width = width;
		this.Length = Length;
		sort="Rectangle";
		length=length() ;
		area=erea();
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	
	public double length() {
		return 2*(width+Length);
	}
	public double erea() {
		return width*Length;
	}
	
}
