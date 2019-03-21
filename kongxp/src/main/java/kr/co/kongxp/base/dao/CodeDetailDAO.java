package kr.co.kongxp.base.dao;

import java.util.ArrayList;
import java.util.List;

import kr.co.kongxp.base.to.CodeDetailTO;

public interface CodeDetailDAO {
	public List<CodeDetailTO> selectDetailCodePartList(String divisionCode);
	public ArrayList<CodeDetailTO> selectCodeDetailList();
	public ArrayList<CodeDetailTO> findCodeDetailList(String codeDetail);
	
	public void insertCodeDetail(CodeDetailTO codeDetailTO);
	public void updateCodeDetail(CodeDetailTO codeDetailTO);
	public void deleteCodeDetail(CodeDetailTO codeDetailTO);

}
