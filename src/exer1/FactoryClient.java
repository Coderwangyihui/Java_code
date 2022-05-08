package exer1;

import java.util.Scanner;

public class FactoryClient {
	public static void main(String[] args) {
		System.out.println("input shape which you want to draw:");
		 Scanner scan=new Scanner(System.in);
		 String str = scan.next();
		 SimpleFactory ar=new SimpleFactory(str);
	}
}
