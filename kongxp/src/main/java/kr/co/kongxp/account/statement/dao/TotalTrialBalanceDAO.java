package kr.co.kongxp.account.statement.dao;

import java.util.List;

import kr.co.kongxp.account.statement.to.TotalTrialBalanceTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface TotalTrialBalanceDAO {

	public List<TotalTrialBalanceTO> selectTotalTrialBalanceList(String approvalDate) throws DataAccessException;
}
