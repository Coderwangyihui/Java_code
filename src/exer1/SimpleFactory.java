package exer1;

public class SimpleFactory{
	public String str;
	public SimpleFactory(String str) {
		super();
		this.str = str;
		switch(str) {
		case "Circle":
			CirclePainter C=new CirclePainter();
			break;
		case "Rect":
			RectPainter R=new RectPainter();
			break;
		}
	}
}
