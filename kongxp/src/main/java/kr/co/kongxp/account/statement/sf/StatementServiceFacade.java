package kr.co.kongxp.account.statement.sf;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.statement.to.EarlyAssetsCountTO;
import kr.co.kongxp.account.statement.to.EarlyFinancialStatementsTO;
import kr.co.kongxp.account.statement.to.EarlyIncomeStatementTO;
import kr.co.kongxp.account.statement.to.EarlyLiabilitiesAndCapitalCountTO;
import kr.co.kongxp.account.statement.to.EarlyrevenuesAndExpenseTO;
import kr.co.kongxp.account.statement.to.FinancialStatementsTO;
import kr.co.kongxp.account.statement.to.IncomeStatementTO;
import kr.co.kongxp.account.statement.to.TotalTrialBalanceTO;
import kr.co.kongxp.account.statement.to.eFinancialStatementsTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface StatementServiceFacade {

	public List<TotalTrialBalanceTO> getTotalTrialBalanceList(String approvalDate)  throws DataAccessException;

	public List<FinancialStatementsTO> getFinancialStatements(HashMap<String, Object> approvalDate)throws DataAccessException;
	public List<eFinancialStatementsTO> getEFinancialStatements()throws DataAccessException;
	
	public List<EarlyrevenuesAndExpenseTO> ComputerevenuesAndExpense()throws DataAccessException;
	public List<EarlyIncomeStatementTO> ComputeIncomeStatement()throws DataAccessException;
	public List<IncomeStatementTO> getIncomeStatement(String approveDate)throws DataAccessException;
	
	public List<EarlyAssetsCountTO> getComputeAssets()throws DataAccessException;
	public List<EarlyLiabilitiesAndCapitalCountTO> getComputeLiabilitiesAndCapital()throws DataAccessException;
	public List<EarlyFinancialStatementsTO> getComputeEarlyFinancialStatements()throws DataAccessException;
}
