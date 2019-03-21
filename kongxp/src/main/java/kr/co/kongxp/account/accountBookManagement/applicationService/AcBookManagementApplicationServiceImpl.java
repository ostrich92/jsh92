package kr.co.kongxp.account.accountBookManagement.applicationService;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.kongxp.account.accountBookManagement.dao.CustomerLedgerDAO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerDetailTO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerTO;

@Component
public class AcBookManagementApplicationServiceImpl implements AcBookManagementApplicationService {
	
	@Autowired
	private CustomerLedgerDAO customerLedgerDAO;


	@Override
	public List<CustomerLedgerTO> getCustomerLedgerInfo(HashMap<String, Object> customerInfo) {
		// TODO Auto-generated method stub
		List<CustomerLedgerTO> customerLedgerInfo = customerLedgerDAO.getCustomerLedgerInfo(customerInfo);
		return customerLedgerInfo;
	}

	@Override
	public List<CustomerLedgerDetailTO> getCustomerLedgerDetailInfo(HashMap<String, Object> customerInfo) {
		// TODO Auto-generated method stub
		List<CustomerLedgerDetailTO> customerLedgerInfo = customerLedgerDAO.getCustomerLedgerDetailInfo(customerInfo);
		return customerLedgerInfo;
	}

}
