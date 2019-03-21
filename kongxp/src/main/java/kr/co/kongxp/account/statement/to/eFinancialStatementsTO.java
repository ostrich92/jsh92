package kr.co.kongxp.account.statement.to;

import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name="ds_EfinancialStatements")
public class eFinancialStatementsTO extends BaseTO{
	private String 
	accountName,
	lPrice,
	rPrice;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getlPrice() {
		return lPrice;
	}

	public void setlPrice(String lPrice) {
		this.lPrice = lPrice;
	}

	public String getrPrice() {
		return rPrice;
	}

	public void setrPrice(String rPrice) {
		this.rPrice = rPrice;
	}
	
	
	

}