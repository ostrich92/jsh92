package kr.co.kongxp.account.acBase.dao;

import java.util.List;

import kr.co.kongxp.account.acBase.to.CustomerTO;

public interface CustomerDAO {

	public List<CustomerTO> selectGeneralCustomerList();
	public void insertCustomer(CustomerTO customerTO);
	public void updateCustomer(CustomerTO customerTO);
	public void deleteCustomer(CustomerTO customerTO);

}
