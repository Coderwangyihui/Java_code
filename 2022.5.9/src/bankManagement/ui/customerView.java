package bankManagement.ui;

import bankManagement.bean.customer;
import bankManagement.service.customerList;
import bankManagement.util.CMUtility;

public class customerView {
	private customerList cl=new customerList(10);
	public customerView() {
		customer ph=new customer("wanghui",'��',20,"17775697526","wangyihuihn@163.com");
		cl.addCustomer(ph);
	}
	public void enterMainView() {
		boolean isFlag=true;
		while(isFlag) {
		System.out.println("--------�ͻ���Ϣ�������-------");
		System.out.println("         1 ��ӿͻ�");
		System.out.println("         2 �޸Ŀͻ�");
		System.out.println("         3 ɾ���ͻ�");
		System.out.println("         4 �ͻ��б�");
		System.out.println("         5 ��   ��\n");
		System.out.print("        �����루1~5��");
		char nemu=CMUtility.readMenuSelection();
		switch(nemu) {
		case '1':
			addNewCustomer() ;
			break;
		case '2':
			modifyCustomer();
			break;
		case '3':
			delCustomer();
			break;
		case '4':
			listAllCustomer();
			break;
		case '5':
			System.out.println("ȷ���Ƿ��˳���Y/N��");
			char isExit=CMUtility.readConfirmSelection() ;
			if('Y'==isExit) {
				isFlag=false;
				System.out.println("�˳�");
			}
			break;
			}
		}
	}
	
	private void addNewCustomer() {
		//System.out.println("��ӿͻ��Ĳ���");
		System.out.println("----------��ӿͻ�---------");
		System.out.print("����");
		String name=CMUtility.readString(10);
		System.out.print("�Ա�");
		char sex=CMUtility.readChar();
		System.out.print("����");
		int age=CMUtility.readInt();
		System.out.print("�绰");
		String tele=CMUtility.readString(13);
		System.out.print("����");
		String email=CMUtility.readString(30);
		customer cust=new customer(name,sex,age,tele,email);
		if(cl.addCustomer(cust))
		{
			System.out.println("----------��ӳɹ�---------");
		}
		else {
			System.out.println("--------Ŀ¼���������ʧ��------");
		}
	}
	
	private void delCustomer() {
		//System.out.println("ɾ���ͻ��Ĳ���");
		System.out.println("----------ɾ���ͻ�---------");
		int isDel;
		while(true) {
			System.out.println("ѡ��ɾ���ͻ��ı��(-1��exit)");
			isDel=CMUtility.readInt();
			if(-1==isDel) {
				return;
			}
			customer isExist=cl.getCustomer(isDel-1);
			if(null==isExist) {
				System.out.println("�޷��ҵ�ָ���û���");
			}else {	
				break;
			}
		}
		System.out.println("��ȷ�ϣ���Y/N��");
		char isChoose=CMUtility.readConfirmSelection();
		if('Y'==isChoose) {
			if(cl.delCustomer(isDel-1)) {
				System.out.println("----------ɾ���ɹ�---------");
			}else {
				System.out.println("----------ɾ��ʧ��---------");
			}
		}else {
			return;
		}
	}
	
	private void modifyCustomer() {
		//System.out.println("�޸Ŀͻ��Ĳ���");
		customer cust;
		int isModify;
		while(true) {
			System.out.print("ѡ���޸Ŀͻ��ı�ţ���-1��exit��");
			isModify=CMUtility.readInt();
			if(-1==isModify) {
				return;
			}
			cust=cl.getCustomer(isModify-1); 
			if(null==cust) {
				System.out.println("�޷��ҵ�ָ���ͻ���");
			}else {				
				break;
			}
		}
		System.out.println("����("+cust.getName()+"):");
		String name=CMUtility.readString(10,cust.getName());
		System.out.println("�Ա�("+cust.getGender()+"):");
		char sex=CMUtility.readChar(cust.getGender());
		System.out.println("����("+cust.getAge()+"):");
		int age=CMUtility.readInt(cust.getAge());
		System.out.println("�绰("+cust.getTele()+"):");
		String tele=CMUtility.readString(13,cust.getTele());
		System.out.println("����("+cust.getEmail()+"):");
		String email=CMUtility.readString(30,cust.getEmail());
		customer newCust=new customer(name,sex,age,tele,email);
		boolean isSuccess=cl.replaceCustomer(newCust,isModify-1);
		if(isSuccess) {
			System.out.println("--------�޸����-------");
		}
	}
	
	private void listAllCustomer() {
		System.out.println("--------�ͻ��б�-------");
		int total=cl.getTotal();
		if(0==total) { 
			System.out.println("û�пͻ���¼��"); 
		}
		else {
			System.out.println("���\t����\t\t�Ա�\t����\t�绰\t\t����");
			customer[] custs=cl.getAllCustomer();
			 for(int i=0;i<custs.length;i++) {
				 
				 System.out.print((i+1)+"\t"+custs[i].getName()+
						 "\t\t"+custs[i].getGender()+"\t"+custs[i].getAge()+"\t"+custs[i].getTele()+
						 "\t"+custs[i].getEmail()+"\n");
			 }
		}
		System.out.println("-------�ͻ��б����------");
	}
	
	public static void main(String[] args) {
		customerView view=new customerView();
		view.enterMainView();
	}
}
