package kr.co.kongxp.account.acBase.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kongxp.account.acBase.applicationService.AcBaseApplicationService;
import kr.co.kongxp.account.acBase.to.AccountSummaryTO;
import kr.co.kongxp.account.acBase.to.AccountTO;
import kr.co.kongxp.account.acBase.to.CustomerTO;

@Service
public class AcBaseServiceFacadeImpl implements AcBaseServiceFacade{
	
	@Autowired
	private AcBaseApplicationService acBaseApplicationService;

	
	@Override	
	public List<AccountTO> getAccountList() {
		// TODO Auto-generated method stub
		List<AccountTO> accountList = acBaseApplicationService.getAccountList();
		return accountList;
	}


	@Override
	public List<AccountSummaryTO> getAccountSummaryList() {
		// TODO Auto-generated method stub
		List<AccountSummaryTO> accountSummaryList = acBaseApplicationService.getAccountSummaryList();
		return accountSummaryList;
	}


	@Override
	public void modifyAccountSummaryList(List<AccountSummaryTO> accountSummaryList) {
		// TODO Auto-generated method stub
		acBaseApplicationService.modifyAccountSummaryList(accountSummaryList);		
	}


	@Override
	public List<CustomerTO> getGeneralCustomerList() {
		// TODO Auto-generated method stub
		List<CustomerTO> customerList =  acBaseApplicationService.getGeneralCustomerList();
		
		return customerList;
	}


	@Override
	public void batchCustomer(List<CustomerTO> customer) {
		// TODO Auto-generated method stub
		acBaseApplicationService.batchCustomer(customer);	
	}

}
