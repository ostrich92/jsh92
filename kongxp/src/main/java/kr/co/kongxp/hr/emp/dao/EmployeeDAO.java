package kr.co.kongxp.hr.emp.dao;

import java.util.ArrayList;

import kr.co.kongxp.hr.emp.to.EmpTO;

public interface EmployeeDAO {

	public ArrayList<EmpTO> selectEmpList(String deptCode);

	public void updateEmpInfo(EmpTO empTO);

	public void updateEmp(EmpTO empTO);

	public void deleteEmp(String empCode);

	public void insertEmp(EmpTO empTO);

	public EmpTO selectEmp(String EmpCode);
}
