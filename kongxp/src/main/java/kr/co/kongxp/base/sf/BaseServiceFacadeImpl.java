package kr.co.kongxp.base.sf;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kongxp.base.applicationService.BaseApplicationService;
import kr.co.kongxp.base.exception.DataNotInputException;
import kr.co.kongxp.base.exception.IdNotFoundException;
import kr.co.kongxp.base.exception.PwMissMatchException;
import kr.co.kongxp.base.to.CodeDetailTO;
import kr.co.kongxp.base.to.CodeTO;
import kr.co.kongxp.base.to.UserMenuTO;
import kr.co.kongxp.common.exception.DataAccessException;
import kr.co.kongxp.hr.emp.to.EmpTO;

@Service
public class BaseServiceFacadeImpl implements BaseServiceFacade {

	@Autowired
	BaseApplicationService baseApplicationService;


	@Override
	public List<CodeDetailTO> getDetailCodePartList(String divisionCode) {
		// TODO Auto-generated method stub
		List<CodeDetailTO> codeDetailList = null;

		codeDetailList = baseApplicationService.getDetailCodePartList(divisionCode);		
		System.out.println("divisionCode : "+ codeDetailList.get(0).getDivisionCodeNo());
		
		return codeDetailList;
	}

	@Override
	public EmpTO loginEmployee(String companyCode, String workplaceCode, String empCode, String userPw)
			throws FileNotFoundException, DataNotInputException, IdNotFoundException, PwMissMatchException {
		// TODO Auto-generated method stub
		EmpTO empto = baseApplicationService.loginEmployee(companyCode, workplaceCode, empCode, userPw);

		System.out.println(empto.getEmpName());
		System.out.println("login SFcheck");

		return empto;
	}

	@Override
	public ArrayList<UserMenuTO> getUserMenuCode(HashMap<String, Object> empInformation) {
		// TODO Auto-generated method stub
		System.out.println("bb");
		ArrayList<UserMenuTO> list = baseApplicationService.getUserMenuCode(empInformation);
		
		System.out.println(list);
		
		return list;
	}

	@Override
	public ArrayList<CodeTO> getCodeList() throws DataAccessException {
		// TODO Auto-generated method stub
		ArrayList<CodeTO> codeList = null;
		codeList = baseApplicationService.getCodeList();
		
		return codeList;
	}

	@Override
	public ArrayList<CodeDetailTO> getCodeDetailList() throws DataAccessException {
		// TODO Auto-generated method stub
		ArrayList<CodeDetailTO> codeDetailList = null;
		codeDetailList = baseApplicationService.getCodeDetailList();
		
		return codeDetailList;
	}

	@Override
	public void batchCodeList(Map<String, Object> batchCodeList) {
		// TODO Auto-generated method stub
		baseApplicationService.batchCodeList(batchCodeList);		
	}

	@Override
	public ArrayList<CodeDetailTO> findCodeDetailList(String codeDetail) {
		// TODO Auto-generated method stub
		ArrayList<CodeDetailTO> codeDetailList = null;
		codeDetailList = baseApplicationService.findCodeDetailList(codeDetail);
		
		return codeDetailList;
	}
}
