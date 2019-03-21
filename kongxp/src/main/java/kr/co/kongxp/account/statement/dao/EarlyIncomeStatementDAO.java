package kr.co.kongxp.account.statement.dao;

import java.util.List;

import kr.co.kongxp.account.statement.to.EarlyIncomeStatementTO;
import kr.co.kongxp.account.statement.to.EarlyrevenuesAndExpenseTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface EarlyIncomeStatementDAO {

	public List<EarlyrevenuesAndExpenseTO> ComputerevenuesAndExpense()throws DataAccessException;
	public List<EarlyIncomeStatementTO> ComputeIncomeStatement()throws DataAccessException;

}
