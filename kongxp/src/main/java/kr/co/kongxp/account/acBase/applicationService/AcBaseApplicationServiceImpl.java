package kr.co.kongxp.account.acBase.applicationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.kongxp.account.acBase.dao.AccountDAO;
import kr.co.kongxp.account.acBase.dao.AccountSummaryDAO;
import kr.co.kongxp.account.acBase.dao.CustomerDAO;
import kr.co.kongxp.account.acBase.to.AccountSummaryTO;
import kr.co.kongxp.account.acBase.to.AccountTO;
import kr.co.kongxp.account.acBase.to.CustomerTO;

@Component
public class AcBaseApplicationServiceImpl implements AcBaseApplicationService {

	@Autowired
	private AccountDAO accountDAO;
	@Autowired
	private AccountSummaryDAO accountSummaryDAO;
	@Autowired
	private CustomerDAO customerDAO;
	

	@Override
	public List<AccountTO> getAccountList() {
		// TODO Auto-generated method stub
		List<AccountTO> accountList = accountDAO.selectAccountList();
		 
		return accountList;
	}

	@Override
	public List<AccountSummaryTO> getAccountSummaryList() {
		// TODO Auto-generated method stub
		List<AccountSummaryTO> accountSummaryList = accountSummaryDAO.selectAccountSummaryList();
		
		return accountSummaryList;
	}

	@Override
	public void modifyAccountSummaryList(List<AccountSummaryTO> accountSummaryList) {
		// TODO Auto-generated method stub
		for(AccountSummaryTO accountSummaryTO: accountSummaryList) {
			System.out.println("accountSummaryTO : "+accountSummaryTO.getAccountInnerCode());
			System.out.println("accountSummaryTO : "+accountSummaryTO.getAccountSummaryDescription());
		switch(accountSummaryTO.getStatus().toString()) {
		case "insert" : 
			accountSummaryDAO.insertAccountSummary(accountSummaryTO);
			break;
		case "delete" : 
			accountSummaryDAO.deleteAccountSummary(accountSummaryTO);
			break;
			}
		}
		
	}

	@Override
	public List<CustomerTO> getGeneralCustomerList() {
		// TODO Auto-generated method stub
		List<CustomerTO> CustomerList = customerDAO.selectGeneralCustomerList();
		
		return CustomerList;
	}

	@Override
	public void batchCustomer(List<CustomerTO> customer) {
		// TODO Auto-generated method stub
			
		for(CustomerTO  customerTO: customer) {
			switch (customerTO.getStatus()) {
			case "insert":
				customerDAO.insertCustomer(customerTO);
				break;
			case "update":
				customerDAO.updateCustomer(customerTO);
				break;
			case "delete":
				customerDAO.deleteCustomer(customerTO);
				break;
			}
		}
		
	}

}
