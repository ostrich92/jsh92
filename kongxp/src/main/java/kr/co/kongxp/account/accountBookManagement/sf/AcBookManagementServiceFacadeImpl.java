package kr.co.kongxp.account.accountBookManagement.sf;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kongxp.account.accountBookManagement.applicationService.AcBookManagementApplicationService;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerDetailTO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerTO;

@Service
public class AcBookManagementServiceFacadeImpl implements AcBookManagementServiceFacade {
	
	@Autowired
	private AcBookManagementApplicationService acBookManagementApplicationService;
	
	
	@Override
	public List<CustomerLedgerTO> getCustomerLedgerInfo(HashMap<String, Object> customerInfo) {
		// TODO Auto-generated method stub
		List<CustomerLedgerTO> customerLedgerInfo = acBookManagementApplicationService.getCustomerLedgerInfo(customerInfo);
		return customerLedgerInfo;
	}

	@Override
	public List<CustomerLedgerDetailTO> getCustomerLedgerDetailInfo(HashMap<String, Object> customerInfo) {
		// TODO Auto-generated method stub
		List<CustomerLedgerDetailTO> customerLedgerInfo = acBookManagementApplicationService.getCustomerLedgerDetailInfo(customerInfo);
		return customerLedgerInfo;
	}

}
