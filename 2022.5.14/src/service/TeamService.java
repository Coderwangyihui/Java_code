package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

public class TeamService {
	private static int counter=1;//����
	private final int MAX_MEMBER=5;
	private int total=0;
	Programmer[] team=new Programmer[MAX_MEMBER];
	
	public TeamService() {
		super();
	}
	
	public Programmer[] getTeam() { 
		Programmer[] team=new Programmer[total];
		for(int i=0;i<team.length;i++) {
			team[i]=this.team[i];
		}
		return team;
	}
	/**
	 * 
	 * @param e
	 * @throws TeamException
	 */
	public void addMember(Employee e) throws TeamException {
		if(total>=MAX_MEMBER) {
			throw new TeamException("��Ա�������޷����");
		}
		if(!(e instanceof Programmer)){
			throw new TeamException("��Ա���ǿ�����Ա���޷����");
		}
		if(isExist(e)) {
			throw new TeamException("��Ա�Ѿ��ڿ����Ŷ���");
		}
		Programmer p=(Programmer)e;
		if(p.getStatus().getNAME().equals("BUSY")){
			throw new TeamException("��Ա�Ѿ���ĳ�����Ŷӳ�Ա");
		}else if(p.getStatus().getNAME().equals("VOCATION")) {
			throw new TeamException("��Ա�����ݼ٣��޷����");
		}
		int numberOfArchitect = 0;
		int numberOfDesigner = 0;
		int numberOfProgrammer = 0;
		for(int i=0;i<total;i++) {
			if(team[i] instanceof Architect) {
				 numberOfArchitect++;
			}else if(team[i] instanceof Designer) {
				numberOfDesigner++;
			}else if(team[i] instanceof Programmer) {
				numberOfProgrammer++;
			}
		}
		if(p instanceof Architect) {
			if(numberOfArchitect>=1)
				throw new TeamException("�Ŷ�������һ���ܹ�ʦ");
		}
		if(p instanceof Designer) {
			if(numberOfDesigner>=2)
				throw new TeamException("�Ŷ��������������ʦ");
		}
		if(p instanceof Programmer) {
			if(numberOfProgrammer>=3)
				throw new TeamException("�Ŷ����������������Ա");
		}
		team[total++]=p;
		p.setStatus(Status.BUSY);
		p.setMenberID(counter++);
	}
	private boolean isExist(Employee e) {
		// TODO Auto-generated method stub
		for(int i=0;i<total;i++) {
			if(team[i].getId()==e.getId()) {
				return true;
			}
		}
		return false;
	}

	public void removeMember(int menberID) throws TeamException{
		int i,j;
		for(i=0;i<total;i++) {
			if(team[i].getMenberID()==menberID) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		if(total==i) {
			throw new TeamException("δ�ҵ�ָ��Ա����ɾ��ʧ��");
		}
		for(j=i+1;j<total;j++) {
			team[j-1]=team[j];
		}
		team[--total]=null;
		
		
	}
}
