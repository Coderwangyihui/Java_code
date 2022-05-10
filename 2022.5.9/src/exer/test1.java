package exer;

public class test1 {
	public static void main(String[] args) {
		human p=new human(5);
		p.getnum(4);
	}
}
class human{
	private int num=3;
	private int[] arr;
	public human(int num) {
		super();
		System.out.print(num);
	}
	public void getnum(int num) {
		System.out.print(num);
	}
}
