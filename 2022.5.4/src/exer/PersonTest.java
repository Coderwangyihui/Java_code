package exer;

public class PersonTest {
	public static void main(String[] args) {
		Person wang=new Person();
		wang.name="wangyihui";
		wang.age=20;
		wang.sex=1;
		wang.study();
		wang.showAge();
		wang.addAge(3);
		wang.showAge();
		Person li=new Person();
		li.showAge();
	}
}
