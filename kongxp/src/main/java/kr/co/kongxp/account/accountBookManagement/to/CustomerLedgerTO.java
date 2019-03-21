package kr.co.kongxp.account.accountBookManagement.to;


import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name="gds_customerLedger")
public class CustomerLedgerTO extends BaseTO{

	private String customerCode;
	private String customerName;
	private String price;
	private String leftDebtorPrice;
	private String rightCreditsPrice;
	private String totalPrice;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLeftDebtorPrice() {
		return leftDebtorPrice;
	}
	public void setLeftDebtorPrice(String leftDebtorPrice) {
		this.leftDebtorPrice = leftDebtorPrice;
	}
	public String getRightCreditsPrice() {
		return rightCreditsPrice;
	}
	public void setRightCreditsPrice(String rightCreditsPrice) {
		this.rightCreditsPrice = rightCreditsPrice;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}



	}
