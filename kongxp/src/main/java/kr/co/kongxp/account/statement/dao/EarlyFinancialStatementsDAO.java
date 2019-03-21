package kr.co.kongxp.account.statement.dao;

import java.util.List;

import kr.co.kongxp.account.statement.to.EarlyAssetsCountTO;
import kr.co.kongxp.account.statement.to.EarlyFinancialStatementsTO;
import kr.co.kongxp.account.statement.to.EarlyLiabilitiesAndCapitalCountTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface EarlyFinancialStatementsDAO {
	
	public List<EarlyAssetsCountTO> ComputeAssets()throws DataAccessException;
	public List<EarlyLiabilitiesAndCapitalCountTO> ComputeLiabilitiesAndCapital()throws DataAccessException;
	public List<EarlyFinancialStatementsTO> ComputeEarlyFinancialStatements()throws DataAccessException;

}
