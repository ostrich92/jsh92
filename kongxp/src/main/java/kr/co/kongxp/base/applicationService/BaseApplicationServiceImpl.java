package kr.co.kongxp.base.applicationService;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.kongxp.base.dao.CodeDAO;
import kr.co.kongxp.base.dao.CodeDetailDAO;
import kr.co.kongxp.base.dao.MenuDAO;
import kr.co.kongxp.base.exception.DataNotInputException;
import kr.co.kongxp.base.exception.IdNotFoundException;
import kr.co.kongxp.base.exception.PwMissMatchException;
import kr.co.kongxp.base.to.CodeDetailTO;
import kr.co.kongxp.base.to.CodeTO;
import kr.co.kongxp.base.to.UserMenuTO;
import kr.co.kongxp.common.exception.DataAccessException;
import kr.co.kongxp.hr.emp.applicationService.EmpApplicationService;
import kr.co.kongxp.hr.emp.to.EmpTO;

@Component
public class BaseApplicationServiceImpl implements BaseApplicationService {
	
	@Autowired
	private EmpApplicationService empApplicationService;
	@Autowired
	private CodeDetailDAO codeDetailDAO;
	@Autowired
	private MenuDAO menuDAO;
	@Autowired
	private CodeDAO codeDAO;
	

	@Override
	public List<CodeDetailTO> getDetailCodePartList(String divisionCode) {
		// TODO Auto-generated method stub
		List<CodeDetailTO> codeDetailList = null;

		codeDetailList = codeDetailDAO.selectDetailCodePartList(divisionCode);
		System.out.println("divisionCode : "+ codeDetailList.get(0).getDivisionCodeNo());

		return codeDetailList;
	}

	@Override
	public EmpTO loginEmployee(String companyCode, String workplaceCode, String empCode, String userPw)
			throws FileNotFoundException, DataNotInputException, IdNotFoundException, PwMissMatchException {
		// TODO Auto-generated method stub
		EmpTO empTO = empApplicationService.selectEmp(empCode);
		
		if (companyCode.equals("") || workplaceCode.equals("") || empCode.equals("") || userPw.equals("")) {
			throw new DataNotInputException("입력하지 않은 값이 있습니다");
		}
		
		if (empTO != null) {

			if (empTO.getEmpCode().equals(empCode)) {
				if (empTO.getUserPw().equals(userPw)) {
					System.out.println(empTO.getEmpName());
					System.out.println("login AScheck");
				} else {
					throw new PwMissMatchException("비밀번호가 일치하지 않습니다.");
				}
			} else {
				throw new FileNotFoundException("입력한 정보가 일치하지 않습니다.");
			}
		}
		
		return empTO;
	}

	@Override
	public ArrayList<UserMenuTO> getUserMenuCode(HashMap<String, Object> empInformation) {
		// TODO Auto-generated method stub
		System.out.println("cc");
		ArrayList<UserMenuTO> list = menuDAO.selectUserMenuCodeList(empInformation);
		
		System.out.println(list);
		
		return list;
	}

	@Override
	public ArrayList<CodeTO> getCodeList() throws DataAccessException {
		// TODO Auto-generated method stub
		ArrayList<CodeTO> codeList = null;
		codeList = codeDAO.selectCodeList();

		return codeList;
	}

	@Override
	public ArrayList<CodeDetailTO> getCodeDetailList() throws DataAccessException {
		// TODO Auto-generated method stub
		ArrayList<CodeDetailTO> codeDetailList = null;
		codeDetailList = codeDetailDAO.selectCodeDetailList();

		return codeDetailList;
	}

	@Override
	public void batchCodeList(Map<String, Object> batchCodeList) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unchecked")
		List<CodeTO> codeList = (List<CodeTO>) batchCodeList.get("codeList");
		@SuppressWarnings("unchecked")
		List<CodeDetailTO> codeDetailList = (List<CodeDetailTO>) batchCodeList.get("codeDetailList");
		
		for(CodeTO  codeTO: codeList) {
			switch (codeTO.getStatus()) {
			case "insert":
				codeDAO.insertCode(codeTO);
				break;
			case "update":
				codeDAO.updateCode(codeTO);
				break;
			case "delete":
				codeDAO.deleteCode(codeTO);
				break;
			}
		}
		
			for(CodeDetailTO  codeDetailTO: codeDetailList) {
			switch (codeDetailTO.getStatus()) {
			case "insert":
				codeDetailDAO.insertCodeDetail(codeDetailTO);
				break;
			case "update":
				codeDetailDAO.updateCodeDetail(codeDetailTO);
				break;
			case "delete":
				codeDetailDAO.deleteCodeDetail(codeDetailTO);
				break;
			}
		}
		
	}

	@Override
	public ArrayList<CodeDetailTO> findCodeDetailList(String codeDetail) {
		// TODO Auto-generated method stub
		ArrayList<CodeDetailTO> codeDetailList = null;
		codeDetailList = codeDetailDAO.findCodeDetailList(codeDetail);

		return codeDetailList;
	}

}
