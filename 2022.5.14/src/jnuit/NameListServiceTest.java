package jnuit;

import org.junit.Test;

import domain.Employee;
import service.NameListService;
import service.TeamException;

/**
 * ≤‚ ‘nameListService
 * @author wangyihui
 *
 */
public class NameListServiceTest {
	@Test
	public void testGetAllEmployee() {
		NameListService service=new NameListService();
		Employee[] employees=service.getALLEmployees();
		for(int i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
	}
	@Test
	public void testGetEmployee(){
		NameListService service=new NameListService();
		int id=1;
		try {
			Employee employee=service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());	
		}
	}
}
