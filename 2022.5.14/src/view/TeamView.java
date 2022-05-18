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
			System.out.println("1-团队列表 2-添加成员 3-删除成员 4-退出 请选择(1~4)");
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
				System.out.println("是否退出？(Y/N)");
				char confirm=TSUtility.readConfirmSelection();
				if('Y'==confirm) {
					flag=false;
				}
				break;
			}
		}
	
	}
	public void listAllEmployees() {
		System.out.println("------------开发团队调度软件------------\n");
		Employee[] employee=listSvc.getALLEmployees();
		if(null==employee||0==employee.length) {
			System.out.println("公司中没有任何成员信息！");
		}
		else {
			System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(int i=0;i<employee.length;i++) {
				System.out.println(employee[i]);
			}
		}
		System.out.println("--------------------------------\n");
	}
	public void getTeam() {
		//System.out.println("查看开发团队成员情况");
		//for(int i=0;i<)
		System.out.println("-------------团队成员列表-------------\n");
		Programmer[] team=teamSvc.getTeam();
		if(null==team||0==team.length) {
			System.out.println("开发团队目前没有成员！");
			return;
		}else {
			System.out.println("TID/ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
			for(int i=0;i<team.length;i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		System.out.println("----------------------------------\n");
	}
	public void addNumber() {
		//System.out.println("添加团队成员");
		System.out.println("-------------添加团队成员-------------");
		System.out.println("请输入待添加员工的ID");
		int id=TSUtility.readInt();
		Employee emp;
		try {
			emp = listSvc.getEmployee(id);
			teamSvc.addMember(emp);
			System.out.println("添加成功");	
			
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("添加失败，原因:"+e.getMessage());
		}
		TSUtility.readReturn();
		
	}
	public void delNumber() {
		//System.out.println("删除团队成员");
		System.out.println("-------------删除团队成员-------------");
		System.out.println("请输入待删除员工的TID");
		int munberID=TSUtility.readInt();
		System.out.println("请确认是否删除（Y/N）");
		char isDel=TSUtility.readConfirmSelection();
		if('N'== isDel) {
			return;
		}
		try {
			teamSvc.removeMember(munberID);
			System.out.println("删除成功");	
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("删除失败，原因:"+e.getMessage()+"无法删除");
		}
		TSUtility.readReturn();
	}
	 public static void main(String[] args) {
		 TeamView view =new TeamView();
		 view.enterMainMenu();
	 }
}
