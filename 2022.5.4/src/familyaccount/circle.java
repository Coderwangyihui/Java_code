package familyaccount;
public class circle {
	public static void main(String[] args){
		boolean isflag=true;
		String details="��֧\t�˻����\t��֧���\t˵��\n";
		int initMoney=10000;
		while(isflag) {
			System.out.println("--------��ͥ��֧�������-------");
			System.out.println("         1 ��֧��ϸ");
			System.out.println("         2 �Ǽ�����");
			System.out.println("         3 �Ǽ�֧��");
			System.out.println("         4 ��   ��\n");
			System.out.print("        �����루1~4��");
			char selection=Utility.readMenuSelection();
			switch(selection) {
			case '1':
				//System.out.println("         1 ��֧��ϸ");
				System.out.println("--------��ǰ��֧��ϸ��¼-------");
				System.out.println(details);
				System.out.println("--------------------------");
				break;
			case '2':
				//System.out.println("         2 �Ǽ�����");
				System.out.print("���������");
				int money= Utility.readNumber();
				System.out.print("��������˵����");
				String info =Utility.readString();
				initMoney+=money;
				details+="����\t"+initMoney+"\t"+money+"\t"+info+"\n";
				System.out.println("----------�Ǽ����---------\n");
				break;
			case '3':
				//System.out.println("         3 �Ǽ�֧��");
				System.out.print("����֧����");
				int pay= Utility.readNumber();
				System.out.print("����֧��˵����");
				String information =Utility.readString();
				if(pay<=initMoney){
					initMoney-=pay;
					details+="֧��\t"+initMoney+"\t"+pay+"\t"+information+"\n";
				}
				else {
					System.out.println("֧����Ȳ��㣡\n");
				}
				System.out.println("----------�Ǽ����---------\n");
				break;
			case '4':
				System.out.println("ȷ���Ƿ��˳���Y/N��");
				char isExit =Utility.readConfirmSelection();
				if(isExit=='Y') {
					isflag=false;
				}
				break;
			}	
		}
	}
}