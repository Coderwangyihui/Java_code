package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

public class TeamView {
	private NameListService listSvc=new NameListService();
	private TeamService teamSvc=new TeamService();
	
	public void enterMainMenu() {
		boolean flag=true;
		int menu=0;
		while(flag) {
			if('1'!=menu) {
				listAllEmployees();
			}
			System.out.println("1-�Ŷ��б� 2-��ӳ�Ա 3-ɾ����Ա 4-�˳� ��ѡ��(1~4)");
			menu=TSUtility.readMenuSelection();
			switch(menu) {
			case '1':
				getTeam();
				break;
			case '2':
				addNumber();
				break;
			case '3':
				delNumber();
				break;
			case '4':
				System.out.println("�Ƿ��˳���(Y/N)");
				char confirm=TSUtility.readConfirmSelection();
				if('Y'==confirm) {
					flag=false;
				}
				break;
			}
		}
	
	}
	public void listAllEmployees() {
		System.out.println("------------�����Ŷӵ������------------\n");
		Employee[] employee=listSvc.getALLEmployees();
		if(null==employee||0==employee.length) {
			System.out.println("��˾��û���κγ�Ա��Ϣ��");
		}
		else {
			System.out.println("ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
			for(int i=0;i<employee.length;i++) {
				System.out.println(employee[i]);
			}
		}
		System.out.println("--------------------------------\n");
	}
	public void getTeam() {
		//System.out.println("�鿴�����Ŷӳ�Ա���");
		//for(int i=0;i<)
		System.out.println("-------------�Ŷӳ�Ա�б�-------------\n");
		Programmer[] team=teamSvc.getTeam();
		if(null==team||0==team.length) {
			System.out.println("�����Ŷ�Ŀǰû�г�Ա��");
			return;
		}else {
			System.out.println("TID/ID\t����\t����\t����\tְλ\t״̬\t����\t��Ʊ\t�����豸");
			for(int i=0;i<team.length;i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		System.out.println("----------------------------------\n");
	}
	public void addNumber() {
		//System.out.println("����Ŷӳ�Ա");
		System.out.println("-------------����Ŷӳ�Ա-------------");
		System.out.println("����������Ա����ID");
		int id=TSUtility.readInt();
		Employee emp;
		try {
			emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
			System.out.println("��ӳɹ�");	
			
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("���ʧ�ܣ�ԭ��:"+e.getMessage());
		}
		TSUtility.readReturn();
		
	}
	public void delNumber() {
		//System.out.println("ɾ���Ŷӳ�Ա");
		System.out.println("-------------ɾ���Ŷӳ�Ա-------------");
		System.out.println("�������ɾ��Ա����TID");
		int munberID=TSUtility.readInt();
		System.out.println("��ȷ���Ƿ�ɾ����Y/N��");
		char isDel=TSUtility.readConfirmSelection();
		if('N'== isDel) {
			return;
		}
		try {
			teamSvc.removeMember(munberID);
			System.out.println("ɾ���ɹ�");	
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("ɾ��ʧ�ܣ�ԭ��:"+e.getMessage()+"�޷�ɾ��");
		}
		TSUtility.readReturn();
	}
	 public static void main(String[] args) {
		 TeamView view =new TeamView();
		 view.enterMainMenu();
	 }
}
