package kr.co.kongxp.account.accountBookManagement.applicationService;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerDetailTO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerTO;

public interface AcBookManagementApplicationService {

	public List<CustomerLedgerTO> getCustomerLedgerInfo(HashMap<String, Object> customerInfo);
	public List<CustomerLedgerDetailTO> getCustomerLedgerDetailInfo(HashMap<String, Object> customerInfo);

}
