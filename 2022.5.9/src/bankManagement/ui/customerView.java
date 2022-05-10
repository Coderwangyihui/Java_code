package bankManagement.ui;

import bankManagement.bean.customer;
import bankManagement.service.customerList;
import bankManagement.util.CMUtility;

public class customerView {
	private customerList cl=new customerList(10);
	public customerView() {
		customer ph=new customer("wanghui",'男',20,"17775697526","wangyihuihn@163.com");
		cl.addCustomer(ph);
	}
	public void enterMainView() {
		boolean isFlag=true;
		while(isFlag) {
		System.out.println("--------客户信息管理软件-------");
		System.out.println("         1 添加客户");
		System.out.println("         2 修改客户");
		System.out.println("         3 删除客户");
		System.out.println("         4 客户列表");
		System.out.println("         5 退   出\n");
		System.out.print("        请输入（1~5）");
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
			System.out.println("确认是否退出（Y/N）");
			char isExit=CMUtility.readConfirmSelection() ;
			if('Y'==isExit) {
				isFlag=false;
				System.out.println("退出");
			}
			break;
			}
		}
	}
	
	private void addNewCustomer() {
		//System.out.println("添加客户的操作");
		System.out.println("----------添加客户---------");
		System.out.print("姓名");
		String name=CMUtility.readString(10);
		System.out.print("性别");
		char sex=CMUtility.readChar();
		System.out.print("年龄");
		int age=CMUtility.readInt();
		System.out.print("电话");
		String tele=CMUtility.readString(13);
		System.out.print("邮箱");
		String email=CMUtility.readString(30);
		customer cust=new customer(name,sex,age,tele,email);
		if(cl.addCustomer(cust))
		{
			System.out.println("----------添加成功---------");
		}
		else {
			System.out.println("--------目录已满，添加失败------");
		}
	}
	
	private void delCustomer() {
		//System.out.println("删除客户的操作");
		System.out.println("----------删除客户---------");
		int isDel;
		while(true) {
			System.out.println("选择删除客户的编号(-1：exit)");
			isDel=CMUtility.readInt();
			if(-1==isDel) {
				return;
			}
			customer isExist=cl.getCustomer(isDel-1);
			if(null==isExist) {
				System.out.println("无法找到指定用户！");
			}else {	
				break;
			}
		}
		System.out.println("请确认：（Y/N）");
		char isChoose=CMUtility.readConfirmSelection();
		if('Y'==isChoose) {
			if(cl.delCustomer(isDel-1)) {
				System.out.println("----------删除成功---------");
			}else {
				System.out.println("----------删除失败---------");
			}
		}else {
			return;
		}
	}
	
	private void modifyCustomer() {
		//System.out.println("修改客户的操作");
		customer cust;
		int isModify;
		while(true) {
			System.out.print("选择修改客户的编号：（-1：exit）");
			isModify=CMUtility.readInt();
			if(-1==isModify) {
				return;
			}
			cust=cl.getCustomer(isModify-1); 
			if(null==cust) {
				System.out.println("无法找到指定客户！");
			}else {				
				break;
			}
		}
		System.out.println("姓名("+cust.getName()+"):");
		String name=CMUtility.readString(10,cust.getName());
		System.out.println("性别("+cust.getGender()+"):");
		char sex=CMUtility.readChar(cust.getGender());
		System.out.println("年龄("+cust.getAge()+"):");
		int age=CMUtility.readInt(cust.getAge());
		System.out.println("电话("+cust.getTele()+"):");
		String tele=CMUtility.readString(13,cust.getTele());
		System.out.println("邮箱("+cust.getEmail()+"):");
		String email=CMUtility.readString(30,cust.getEmail());
		customer newCust=new customer(name,sex,age,tele,email);
		boolean isSuccess=cl.replaceCustomer(newCust,isModify-1);
		if(isSuccess) {
			System.out.println("--------修改完成-------");
		}
	}
	
	private void listAllCustomer() {
		System.out.println("--------客户列表-------");
		int total=cl.getTotal();
		if(0==total) { 
			System.out.println("没有客户记录！"); 
		}
		else {
			System.out.println("编号\t姓名\t\t性别\t年龄\t电话\t\t邮箱");
			customer[] custs=cl.getAllCustomer();
			 for(int i=0;i<custs.length;i++) {
				 
				 System.out.print((i+1)+"\t"+custs[i].getName()+
						 "\t\t"+custs[i].getGender()+"\t"+custs[i].getAge()+"\t"+custs[i].getTele()+
						 "\t"+custs[i].getEmail()+"\n");
			 }
		}
		System.out.println("-------客户列表完成------");
	}
	
	public static void main(String[] args) {
		customerView view=new customerView();
		view.enterMainView();
	}
}
