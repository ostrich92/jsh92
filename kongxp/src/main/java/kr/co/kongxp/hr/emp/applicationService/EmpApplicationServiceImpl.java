package kr.co.kongxp.hr.emp.applicationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.kongxp.hr.emp.dao.EmployeeDAO;
import kr.co.kongxp.hr.emp.to.EmpTO;

@Component
public class EmpApplicationServiceImpl implements EmpApplicationService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	

	@Override
	public EmpTO selectEmp(String empCode) {
		// TODO Auto-generated method stub
		EmpTO empto = employeeDAO.selectEmp(empCode);
		
		System.out.println(empto.getEmpCode());
		System.out.println(empto.getEmpName());
		System.out.println(empto.getUserPw());
		System.out.println(empto.getWorkplaceCode());
		
		return empto;
	}
}
