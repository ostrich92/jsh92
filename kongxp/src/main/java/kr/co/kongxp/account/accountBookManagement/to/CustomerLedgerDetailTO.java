package kr.co.kongxp.account.accountBookManagement.to;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;


@Dataset(name="gds_customerLedgerDetail")
public class CustomerLedgerDetailTO extends BaseTO{
	private String slipApprovalDate;
	private String customerCode;
	private String customerName;
	private String lPrice;
	private String Rprice;
	private String balance;
	public String getSlipApprovalDate() {
		return slipApprovalDate;
	}
	public void setSlipApprovalDate(String slipApprovalDate) {
		this.slipApprovalDate = slipApprovalDate;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getlPrice() {
		return lPrice;
	}
	
	@Column(name="R_PRICE")
	public void setlPrice(String lPrice) {
		this.lPrice = lPrice;
	}
	@Column(name="R_PRICE")
	public String getRprice() {
		return Rprice;
	}
	public void setRprice(String rprice) {
		Rprice = rprice;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
}
