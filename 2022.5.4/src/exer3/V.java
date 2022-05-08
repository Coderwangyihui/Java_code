package exer3;

public class V {
	String sort;
	double length;
	double area;
	public double h=10;
	public void getData(){
		System.out.println(sort+" "+length+" "+area+" V:"+toV(h,area));
	}
	public double toV(double h,double area) {
		return h*area;
	}
}
