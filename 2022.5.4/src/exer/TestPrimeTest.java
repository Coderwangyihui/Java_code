package exer;

public class TestPrimeTest {
public static void main(String[] args) {
	TestPrime wang=new TestPrime();
	wang.init();
	wang.disPlay();
	System.out.println("");
	wang.getPrimeAndPosition();
	System.out.println("");
	System.out.println("质数个数"+wang.getPrimeTotalNumber()) ;
}
}
