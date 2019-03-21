package kr.co.kongxp.account.statement.applicaitonService;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.kongxp.account.statement.dao.EarlyFinancialStatementsDAO;
import kr.co.kongxp.account.statement.dao.EarlyIncomeStatementDAO;
import kr.co.kongxp.account.statement.dao.FinancialStatementsDAO;
import kr.co.kongxp.account.statement.dao.IncomeStatementDAO;
import kr.co.kongxp.account.statement.dao.TotalTrialBalanceDAO;
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

@Component
public class StatementApplicationServiceImpl implements StatementApplicationService {

	@Autowired
	private TotalTrialBalanceDAO totalTrialBalanceDAO;
	@Autowired
	private FinancialStatementsDAO financialStatementsDAO;
	@Autowired
	private EarlyIncomeStatementDAO earlyIncomeStatementDAO;
	@Autowired
	private IncomeStatementDAO incomeStatementDAO;
	@Autowired
	private EarlyFinancialStatementsDAO earlyFinancialStatementsDAO;


	@Override
	public List<TotalTrialBalanceTO> getTotalTrialBalanceList(String approvalDate) throws DataAccessException {
		// TODO Auto-generated method stub	
		List<TotalTrialBalanceTO> TotalTrialBalanceList = null;

		TotalTrialBalanceList = totalTrialBalanceDAO.selectTotalTrialBalanceList(approvalDate);

		return TotalTrialBalanceList;
	}

	@Override
	public List<FinancialStatementsTO> getFinancialStatements(HashMap<String, Object> approvalDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<FinancialStatementsTO> FinancialStatementsList = null;
		FinancialStatementsList = financialStatementsDAO.selectFinancialStatements(approvalDate);
		return FinancialStatementsList;
	}

	@Override
	public List<eFinancialStatementsTO> getEFinancialStatements() throws DataAccessException {
		// TODO Auto-generated method stub
		List<eFinancialStatementsTO> eFinancialStatementsList = null;
		eFinancialStatementsList = financialStatementsDAO.selectEFinancialStatements();
		return eFinancialStatementsList;
	}

	@Override
	public List<EarlyrevenuesAndExpenseTO> ComputerevenuesAndExpense() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyrevenuesAndExpenseTO> EarlyrevenuesAndExpenseList = null;
		EarlyrevenuesAndExpenseList = earlyIncomeStatementDAO.ComputerevenuesAndExpense();
		return EarlyrevenuesAndExpenseList;
	}

	@Override
	public List<EarlyIncomeStatementTO> ComputeIncomeStatement() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyIncomeStatementTO> EarlyIncomeStatementList = null;
		EarlyIncomeStatementList = earlyIncomeStatementDAO.ComputeIncomeStatement();
		return EarlyIncomeStatementList;
	}

	@Override
	public List<IncomeStatementTO> getIncomeStatement(String approveDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<IncomeStatementTO> incomeStatementList = null;
		incomeStatementList = incomeStatementDAO.selectIncomeStatement(approveDate);
		return incomeStatementList;
	}

	@Override
	public List<EarlyAssetsCountTO> getComputeAssets() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyAssetsCountTO> earlyAccountCountList = null;
		earlyAccountCountList = earlyFinancialStatementsDAO.ComputeAssets();
		return earlyAccountCountList;
	}

	@Override
	public List<EarlyLiabilitiesAndCapitalCountTO> getComputeLiabilitiesAndCapital() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyLiabilitiesAndCapitalCountTO> earlyAccountCountList = null;
		earlyAccountCountList = earlyFinancialStatementsDAO.ComputeLiabilitiesAndCapital();
		return earlyAccountCountList;
	}

	@Override
	public List<EarlyFinancialStatementsTO> getComputeEarlyFinancialStatements() throws DataAccessException {
		// TODO Auto-generated method stub
		List<EarlyFinancialStatementsTO> earlyFinancialStatementsList = null;
		earlyFinancialStatementsList = earlyFinancialStatementsDAO.ComputeEarlyFinancialStatements();
		return earlyFinancialStatementsList;
	}
	
}
