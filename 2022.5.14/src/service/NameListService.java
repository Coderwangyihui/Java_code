package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.NoteBook;
import domain.PC;
import domain.Printer;
import domain.Programmer;
import domain.equipment;

import static service.Data.*;
/**
 * 
 * @author wangyihui
 *
 */
public class NameListService {
	private Employee[] employees;
	public NameListService() {
		employees=new Employee[EMPLOYEES.length];
		for(int i=0;i<employees.length;i++) {
			 int type=Integer.parseInt(EMPLOYEES[i][0]);
			 int id=Integer.parseInt(EMPLOYEES[i][1]);
			 String name=EMPLOYEES[i][2];
			 int age=Integer.parseInt(EMPLOYEES[i][3]);
			 double salary=Double.parseDouble(EMPLOYEES[i][4]);
			 equipment equipments;
			 double bonus;
			 switch(type) {
			 case EMPLOYEE:
				 employees[i]=new Employee(id,name,age,salary);
				 break;
			 case PROGRAMMER:
				equipments=creatEquipment(i);
				 employees[i]=new Programmer(id,name,age,salary,equipments);
				 break;
			 case DESIGNER:
				equipments=creatEquipment(i);
				bonus=Double.parseDouble(EMPLOYEES[i][5]);
				 employees[i]=new Designer(id,name,age,salary,equipments,bonus);
				 break;
			 case ARCHITECT:
				 equipments=creatEquipment(i);
				 bonus=Double.parseDouble(EMPLOYEES[i][5]);
				 int stock=Integer.parseInt(EMPLOYEES[i][6]);
				 employees[i]=new Architect(id,name,age,salary,equipments,bonus,stock);
				 break;
			 }
		}
	}
	
	private equipment creatEquipment(int index) {
		int key =Integer.parseInt(EQIPMENTS[index][0]);
		String model=EQIPMENTS[index][1];
		switch(key) {
		case PC:
			String display=EQIPMENTS[index][2];
			return new PC(model,display);
		case NOTEBOOK:
			double price=Double.parseDouble(EQIPMENTS[index][2]);
			return new NoteBook(model,price);
		case PRINTER:
			String type=EQIPMENTS[index][2];
			return new Printer(model,type);
			}
		return null;
	}
	public Employee[] getALLEmployees(){
		return employees;
	}

	public Employee getEmployee(int id) throws TeamException{ 
			for(int i=0;i<employees.length;i++) {
				if(id==employees[i].getId()) {
					return employees[i];
				}
			}
			throw new TeamException("找不到指定员工");
	}	
}
