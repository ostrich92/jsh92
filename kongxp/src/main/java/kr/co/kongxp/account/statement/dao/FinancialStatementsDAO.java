package kr.co.kongxp.account.statement.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.statement.to.FinancialStatementsTO;
import kr.co.kongxp.account.statement.to.eFinancialStatementsTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface FinancialStatementsDAO {

	public List<FinancialStatementsTO> selectFinancialStatements(HashMap<String, Object> approvalDate)throws DataAccessException;
	public List<eFinancialStatementsTO> selectEFinancialStatements()throws DataAccessException;
	
}
