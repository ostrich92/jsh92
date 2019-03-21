package kr.co.kongxp.account.statement.dao;

import java.util.List;

import kr.co.kongxp.account.statement.to.IncomeStatementTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface IncomeStatementDAO {

	public List<IncomeStatementTO> selectIncomeStatement(String approveDate)throws DataAccessException;
}
