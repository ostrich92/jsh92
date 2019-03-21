package kr.co.kongxp.account.accountBookManagement.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerDetailTO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface CustomerLedgerDAO {

	public List<CustomerLedgerTO> getCustomerLedgerInfo(HashMap<String, Object> customerInfo) throws DataAccessException;
	public List<CustomerLedgerDetailTO> getCustomerLedgerDetailInfo(HashMap<String, Object> customerInfo) throws DataAccessException;
	
}
