package kr.co.kongxp.account.acBase.to;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name = "gds_accountSummary")
public class AccountSummaryTO extends BaseTO {
	private String accountInnerCode, 
		accountSummaryDescription;

	@Column(name = "ACCOUNT_INNER_CODE")
	public String getAccountInnerCode() {
		return accountInnerCode;
	}

	@Column(name = "ACCOUNT_INNER_CODE")
	public void setAccountInnerCode(String accountInnerCode) {
		this.accountInnerCode = accountInnerCode;
	}

	@Column(name = "ACCOUNT_SUMMARY_DESCRIPTION")
	public String getAccountSummaryDescription() {
		return accountSummaryDescription;
	}

	@Column(name = "ACCOUNT_SUMMARY_DESCRIPTION")
	public void setAccountSummaryDescription(String accountSummaryDescription) {
		this.accountSummaryDescription = accountSummaryDescription;
	}

}
