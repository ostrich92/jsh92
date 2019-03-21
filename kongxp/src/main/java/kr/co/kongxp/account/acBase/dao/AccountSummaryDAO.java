package kr.co.kongxp.account.acBase.dao;

import java.util.List;

import kr.co.kongxp.account.acBase.to.AccountSummaryTO;


public interface AccountSummaryDAO {

	public List<AccountSummaryTO> selectAccountSummaryList();
	public void insertAccountSummary(AccountSummaryTO accountSummaryTO);
	public void deleteAccountSummary(AccountSummaryTO accountSummaryTO);

}
