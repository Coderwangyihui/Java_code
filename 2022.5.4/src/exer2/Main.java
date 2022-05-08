package exer2;

public class Main {
	public static void main(String[] args) {
		student[] arr1=new student[6];
		teacher[] arr2=new teacher[4];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=new student();
			arr1[i].setData("wangyihui"+i, 'm', i+19,i,"计算机科学与技术");
		}
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=new teacher();
			arr2[i].setData("wangbo"+i, 'm', i+40,i,"计算机学院");
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i].getDetail());
		}	
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i].getDetail());
		}	
	}
}
