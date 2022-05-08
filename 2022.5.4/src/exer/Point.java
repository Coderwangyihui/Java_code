package exer;

public class Point {
	int x;
	int y;
	public Point() {
		int x=0;
		int y=0;
	}
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}
	public void getPoint() {
		System.out.printf("(%d,%d)\n",x,y);
	}
	public void movePoint(int x,int y) {
		this.x+=x;
		this.y+=y;
	}
}
