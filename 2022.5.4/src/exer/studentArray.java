package exer;

public class studentArray {
	public static void main(String[] args) {
		student arr[]=new student[20];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new student();
			arr[i].number=i+1;
			arr[i].state=(int)(Math.random()*6+1);
			arr[i].score=(int)(Math.random()*101);
		}
		print3(arr);
	}
	static void print3(student[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].state==3) {
				System.out.println(arr[i].number+","+arr[i].score+","+arr[i].state );	
			}
		}
	}
}
class student{
	int number;
	int state;
	int score;
}
