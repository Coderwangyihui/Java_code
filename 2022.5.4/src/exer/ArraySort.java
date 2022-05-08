package exer;

public class ArraySort {
	int[] sim;
	public ArraySort(int m) {
		;
	}
	public void setOrder() {
		int p = sim.length;
		while (p != 1)
		{
			int rear = 0;
			for (int i = 1;i < p;i++)
			{
				if (sim[ i - 1] > sim [i])
				{
					sim[ i - 1] =sim [i] ^ sim[ i - 1] ;
					sim [i] = sim [i] ^ sim[ i - 1] ;
					sim[ i - 1] = sim [i] ^ sim[ i - 1] ;
					rear = i;
				}
			}
			p = rear;
		}
	}
}
