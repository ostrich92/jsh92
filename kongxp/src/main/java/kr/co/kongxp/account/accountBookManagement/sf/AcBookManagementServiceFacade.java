package kr.co.kongxp.account.accountBookManagement.sf;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerDetailTO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerTO;


public interface AcBookManagementServiceFacade {

	public List<CustomerLedgerTO> getCustomerLedgerInfo(HashMap<String, Object> customerInfo);
	public List<CustomerLedgerDetailTO> getCustomerLedgerDetailInfo(HashMap<String, Object> customerInfo);

}
