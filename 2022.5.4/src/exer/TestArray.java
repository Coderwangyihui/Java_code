package exer;
public class TestArray {
	public static void main(String[] args) {
		ArraySort p=new ArraySort(6);
		p.sim= new int[]{6,5,4,3,2,1};
		p.setOrder();
		for(int i=0;i<6;i++) {
			System.out.print(p.sim[i]+" ");
		}
	}
}
