package kr.co.kongxp.base.sf;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.kongxp.base.exception.DataNotInputException;
import kr.co.kongxp.base.exception.IdNotFoundException;
import kr.co.kongxp.base.exception.PwMissMatchException;
import kr.co.kongxp.base.to.CodeDetailTO;
import kr.co.kongxp.base.to.CodeTO;
import kr.co.kongxp.base.to.UserMenuTO;
import kr.co.kongxp.common.exception.DataAccessException;
import kr.co.kongxp.hr.emp.to.EmpTO;

public interface BaseServiceFacade {

	public List<CodeDetailTO> getDetailCodePartList(String divisionCode);
	public ArrayList<CodeTO> getCodeList() throws DataAccessException;
	public ArrayList<CodeDetailTO> getCodeDetailList() throws DataAccessException;
	public void batchCodeList(Map<String, Object> batchCodeList);
	public ArrayList<CodeDetailTO> findCodeDetailList(String codeDetail);

	public EmpTO loginEmployee(String companyCode,String workplaceCode,String empCode,String userPw) throws FileNotFoundException, DataNotInputException, IdNotFoundException, PwMissMatchException;
	public ArrayList<UserMenuTO> getUserMenuCode(HashMap<String, Object> empInformation);
}
