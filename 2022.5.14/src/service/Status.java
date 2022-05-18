package service;
/**
 * 
 * @author wangyihui
 *
 */
public class Status {
	private final String NAME;
	private Status(String name){
		this.NAME=name;
	}
	public static final Status FREE=new Status("FREE");
	public static final Status VOCATION=new Status("VOCATION");
	public static final Status BUSY=new Status("BUSY");
	@Override
	public String toString() {
		return NAME;
	}
	public String getNAME() {
		return NAME;
	}
	
}//�����ģʽ��˼�룺�����ģʽ�����˵��
