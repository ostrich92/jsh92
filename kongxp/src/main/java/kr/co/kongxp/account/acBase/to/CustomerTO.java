package kr.co.kongxp.account.acBase.to;

import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;


@Dataset(name="ds_customer")
public class CustomerTO extends BaseTO{
	
	private String customerCode
	,workplaceCode
	,customerName
	,customerType
	,customerCEO
	,businessLicenseNumber
	,socialSecurityNumber
	,customerBusinessConditions
	,customerBusinessItems
	,customerZipCode
	,customerBasicAddress
	,customerDetailAddress
	,customerTelNumber
	,customerFaxNumber
	,customerNote
	,accountNumber
	,cardNumber
	,cardType
	,cardMemberName
	,cardOpenPlace
	,financialInstituteCode
	,financialInstituteName;

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getWorkplaceCode() {
		return workplaceCode;
	}

	public void setWorkplaceCode(String workplaceCode) {
		this.workplaceCode = workplaceCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getCustomerCEO() {
		return customerCEO;
	}

	public void setCustomerCEO(String customerCEO) {
		this.customerCEO = customerCEO;
	}

	public String getBusinessLicenseNumber() {
		return businessLicenseNumber;
	}

	public void setBusinessLicenseNumber(String businessLicenseNumber) {
		this.businessLicenseNumber = businessLicenseNumber;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getCustomerBusinessConditions() {
		return customerBusinessConditions;
	}

	public void setCustomerBusinessConditions(String customerBusinessConditions) {
		this.customerBusinessConditions = customerBusinessConditions;
	}

	public String getCustomerBusinessItems() {
		return customerBusinessItems;
	}

	public void setCustomerBusinessItems(String customerBusinessItems) {
		this.customerBusinessItems = customerBusinessItems;
	}

	public String getCustomerZipCode() {
		return customerZipCode;
	}

	public void setCustomerZipCode(String customerZipCode) {
		this.customerZipCode = customerZipCode;
	}

	public String getCustomerBasicAddress() {
		return customerBasicAddress;
	}

	public void setCustomerBasicAddress(String customerBasicAddress) {
		this.customerBasicAddress = customerBasicAddress;
	}

	public String getCustomerDetailAddress() {
		return customerDetailAddress;
	}

	public void setCustomerDetailAddress(String customerDetailAddress) {
		this.customerDetailAddress = customerDetailAddress;
	}

	public String getCustomerTelNumber() {
		return customerTelNumber;
	}

	public void setCustomerTelNumber(String customerTelNumber) {
		this.customerTelNumber = customerTelNumber;
	}

	public String getCustomerFaxNumber() {
		return customerFaxNumber;
	}

	public void setCustomerFaxNumber(String customerFaxNumber) {
		this.customerFaxNumber = customerFaxNumber;
	}

	public String getCustomerNote() {
		return customerNote;
	}

	public void setCustomerNote(String customerNote) {
		this.customerNote = customerNote;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getCardMemberName() {
		return cardMemberName;
	}

	public void setCardMemberName(String cardMemberName) {
		this.cardMemberName = cardMemberName;
	}

	public String getCardOpenPlace() {
		return cardOpenPlace;
	}

	public void setCardOpenPlace(String cardOpenPlace) {
		this.cardOpenPlace = cardOpenPlace;
	}

	public String getFinancialInstituteCode() {
		return financialInstituteCode;
	}

	public void setFinancialInstituteCode(String financialInstituteCode) {
		this.financialInstituteCode = financialInstituteCode;
	}

	public String getFinancialInstituteName() {
		return financialInstituteName;
	}

	public void setFinancialInstituteName(String financialInstituteName) {
		this.financialInstituteName = financialInstituteName;
	}
	
	

}
