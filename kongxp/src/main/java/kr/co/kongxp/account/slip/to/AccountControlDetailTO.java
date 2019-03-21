package kr.co.kongxp.account.slip.to;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name="gds_accountControlDetail")
public class AccountControlDetailTO extends BaseTO{
	private String accountCode,accountcontrolCode, accountcontrolName, accountcontrolType, accountcontrolDescription;


	@Column(name="ACCOUNT_CODE")
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	@Column(name="ACCOUNT_CONTROL_CODE")
	public String getAccountcontrolCode() {
		return accountcontrolCode;
	}

	public void setAccountcontrolCode(String accountcontrolCode) {
		this.accountcontrolCode = accountcontrolCode;
	}
	@Column(name="ACCOUNT_CONTROL_NAME")
	public String getAccountcontrolName() {
		return accountcontrolName;
	}

	public void setAccountcontrolName(String accountcontrolName) {
		this.accountcontrolName = accountcontrolName;
	}

	@Column(name="ACCOUNT_CONTROL_TYPE")
	public String getAccountcontrolType() {
		return accountcontrolType;
	}

	public void setAccountcontrolType(String accountcontrolType) {
		this.accountcontrolType = accountcontrolType;
	}

	@Column(name="ACCOUNT_CONTROL_DESCRIPTION")
	public String getAccountcontrolDescription() {
		return accountcontrolDescription;
	}

	public void setAccountcontrolDescription(String accountcontrolDescription) {
		this.accountcontrolDescription = accountcontrolDescription;
	}
}
