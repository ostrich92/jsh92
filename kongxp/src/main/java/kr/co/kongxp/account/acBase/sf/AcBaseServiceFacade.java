package kr.co.kongxp.account.acBase.sf;

import java.util.List;

import kr.co.kongxp.account.acBase.to.AccountSummaryTO;
import kr.co.kongxp.account.acBase.to.AccountTO;
import kr.co.kongxp.account.acBase.to.CustomerTO;


public interface AcBaseServiceFacade {
	
	public List<AccountTO> getAccountList();
	
	public List<AccountSummaryTO> getAccountSummaryList();
	public void modifyAccountSummaryList(List<AccountSummaryTO> accountSummaryList);
	
	public List<CustomerTO> getGeneralCustomerList();
	public void batchCustomer(List<CustomerTO> customer);

}
