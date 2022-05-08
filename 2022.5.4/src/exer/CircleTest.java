package exer;

public class CircleTest {
	public static void main(String[] args) {
		Circle ip=new Circle();
		ip.r=3;
		System.out.print(ip.area());
	}
}
class Circle{
	double PI=3.14;
	double r;
	public double area() {
		double area=r*r*PI; 
		return area;
	}
}