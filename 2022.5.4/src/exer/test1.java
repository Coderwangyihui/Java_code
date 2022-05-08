package exer;
public class test1 {
	public static void main(String[] args) {
		int[][] arr=new int[][] {{3,5,8},{12,9},{7,0,6,4}}; 
		int sum=0;
		for(int x=0;x<arr.length;x++) {
			for(int y=0;y<arr[x].length;y++) {
				sum+=arr[x][y];
			}
		}
		System.out.printf("sum=%d",sum);
	}
}
