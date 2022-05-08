package exer;
class TestPrime {
	int[][]arr=new int[10][10];
	
	public void init() {
		int num=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=num;
			num++;
			}
		}
	}
	public void disPlay() {
		for(int id=0;id<arr.length;id++) {
			for(int jd=0;jd<arr[id].length;jd++) {
			System.out.print(arr[id][jd]+" ");
			}
		}
	}
	
	public int getPrimeTotalNumber(){
		int sum=0;
		for(int ic=1;ic<arr.length;ic++) {
			for(int jc=1;jc<arr[ic].length;jc++) {
			if(isPrime(arr[ic][jc]))
				sum++;
			}
		}
		return sum;
	}
	public void getPrimeAndPosition() {
		for(int ib=0;ib<arr.length;ib++) {
			for(int jb=0;jb<arr[ib].length;jb++) {
			if(isPrime(arr[ib][jb]))
				System.out.printf("%d(%d,%d) ",arr[ib][jb],ib,jb);
			}
		}
	}
	
	private boolean isPrime(int num) {
		boolean isprime=true;
		int k = (int) Math.sqrt(num);
			for (int i = 2; i <= k; i++)
			{
				if (num % i == 0) {
				isprime = false;//²»ÊÇËØÊý
				break;
				}
			}
		return isprime;
	}
}
	

