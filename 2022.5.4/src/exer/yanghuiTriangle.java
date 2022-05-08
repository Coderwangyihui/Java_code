package exer;
public class yanghuiTriangle {
	public static void main(String[] args) {
		/*int[][]arr=new int[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][0]=1;
				arr[i][i]=1;
				if(i>1&&j!=0&&j!=i)
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int x=0;x<10;x++) {
			for(int y=0;y<=x;y++) {
				System.out.print(arr[x][y]+" ");
				if(y==x)
					System.out.println();
			}
		}*/
		int[][]arr=new int[10][];
		for(int x=0;x<arr.length;x++) {
			arr[x]=new int [x+1] ;
			arr[x][0]=1;
			arr[x][x]=1;
			//if(x>1) {
				for(int y=1;y<arr[x].length-1;y++) {
					arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
				}
			//}
		}
		for(int x=0;x<10;x++) {
			for(int y=0;y<=x;y++) {
				System.out.print(arr[x][y]+" ");
				if(y==x)
					System.out.println();
			}
		}
	}
	
}
