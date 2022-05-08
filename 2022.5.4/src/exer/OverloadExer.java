package exer;

public class OverloadExer {
	public void MOL(int i) {
		System.out.print(i*i);
	}
	public void MOL(int i,int j) {
		System.out.print(i*j);
	}
	public void MOL(String s) {
		System.out.print(s);
	}
	public int max(int i,int j) {
		return i>j?i:j;
	}
	public double max(double i,double j) {
		return i>j?i:j;
	}
	public double max(double i,double j,double k) {
		return i>(j>k?j:k)?i:(j>k?j:k);
	}
}
