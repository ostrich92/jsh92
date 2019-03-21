package kr.co.kongxp.account.statement.sf;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kongxp.account.statement.applicaitonService.StatementApplicationService;
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

@Service
public class StatementServiceFacadeImpl implements StatementServiceFacade {

	@Autowired
	private StatementApplicationService statementApplicationService;
	
	
	@Override
	public List<TotalTrialBalanceTO> getTotalTrialBalanceList(String approvalDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<TotalTrialBalanceTO> TotalTrialBalanceList = null;

		TotalTrialBalanceList = statementApplicationService.getTotalTrialBalanceList(approvalDate);

		return TotalTrialBalanceList;
	}


	@Override
	public List<FinancialStatementsTO> getFinancialStatements(HashMap<String, Object> approvalDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<FinancialStatementsTO> FinancialStatementsList = null;
		FinancialStatementsList = statementApplicationService.getFinancialStatements(approvalDate);
		
		return FinancialStatementsList;
	}


	@Override
	public List<eFinancialStatementsTO> getEFinancialStatements() throws DataAccessException {
		// TODO Auto-generated method stub
		List<eFinancialStatementsTO> eFinancialStatementsList = null;
		eFinancialStatementsList = statementApplicationService.getEFinancialStatements();
		
		return eFinancialStatementsList;
	}


	@Override
	public List<EarlyrevenuesAndExpenseTO> ComputerevenuesAndExpense() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyrevenuesAndExpenseTO> earlyAccountCountList = null;
		earlyAccountCountList = statementApplicationService.ComputerevenuesAndExpense();
		
		return earlyAccountCountList;
	}


	@Override
	public List<EarlyIncomeStatementTO> ComputeIncomeStatement() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyIncomeStatementTO> earlyAccountCountList = null;
		earlyAccountCountList = statementApplicationService.ComputeIncomeStatement();
		
		return earlyAccountCountList;
	}


	@Override
	public List<IncomeStatementTO> getIncomeStatement(String approveDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<IncomeStatementTO> incomeStatementList = null;
		incomeStatementList = statementApplicationService.getIncomeStatement(approveDate);
		return incomeStatementList;
	}


	@Override
	public List<EarlyAssetsCountTO> getComputeAssets() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyAssetsCountTO> earlyAccountCountList = null;
		earlyAccountCountList = statementApplicationService.getComputeAssets();
		
		return earlyAccountCountList;
	}

	@Override
	public List<EarlyLiabilitiesAndCapitalCountTO> getComputeLiabilitiesAndCapital() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyLiabilitiesAndCapitalCountTO> earlyAccountCountList = null;
		earlyAccountCountList = statementApplicationService.getComputeLiabilitiesAndCapital();
		
		return earlyAccountCountList;
	}


	@Override
	public List<EarlyFinancialStatementsTO> getComputeEarlyFinancialStatements() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyFinancialStatementsTO> earlyAccountCountList = null;
		earlyAccountCountList = statementApplicationService.getComputeEarlyFinancialStatements();
		
		return earlyAccountCountList;
	}

}
