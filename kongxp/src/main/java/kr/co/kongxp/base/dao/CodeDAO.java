package kr.co.kongxp.base.dao;

import java.util.ArrayList;

import kr.co.kongxp.base.to.CodeTO;


public interface CodeDAO {

	public ArrayList<CodeTO> selectCodeList();

	public void insertCode(CodeTO codeTO);
	public void updateCode(CodeTO codeTO);
	public void deleteCode(CodeTO codeTO);

}
