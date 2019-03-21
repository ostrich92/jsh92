package kr.co.kongxp.account.slip.to;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name="gds_slip")
public class SlipTO extends BaseTO{
	private String slipNo;
	private String accountPeriodNo;
	private String deptCode;
	private String slipType;
	private String expenseReport;
	private String authorizationStatus;
	private String reportingEmpCode;
	private String reportingDate;
	private String reportingTime;
	private String approvalEmpCode;
	private String approvalDate;
	private String approvalTime;
	private String modifyingEmpCode;
	private String modifyingDate;
	private String modifyingTime;
	private String accountDifference;
	private String slipDescription;
	private String slipStatus;
	//private List<JournalTO> journalToList;

	

/*	public List<JournalTO> getJournalToList() {
		return journalToList;
	}

	public void setJournalToList(List<JournalTO> journalToList) {
		this.journalToList = journalToList;
	}*/
	@Column(name="ACCOUNT_DIFFERENCE")
	public String getAccountDifference() {
		return accountDifference;
	}
	@Column(name="ACCOUNT_DIFFERENCE")
	public void setAccountDifference(String accountDifference) {
		this.accountDifference = accountDifference;
	}
	@Column(name="SLIP_STATUS")
	public String getSlipStatus() {
		return slipStatus;
	}

	@Column(name="SLIP_STATUS")
	public void setSlipStatus(String slipStatus) {
		this.slipStatus = slipStatus;
	}

	@Column(name="SLIP_NO")
	public String getSlipNo() {
		return slipNo;
	}
	@Column(name="SLIP_NO")
	public void setSlipNo(String slipNo) {
		this.slipNo = slipNo;
	}
	@Column(name="ACCOUNT_PERIOD_NO")
	public String getAccountPeriodNo() {
		return accountPeriodNo;
	}
	@Column(name="ACCOUNT_PERIOD_NO")
	public void setAccountPeriodNo(String accountPeriodNo) {
		this.accountPeriodNo = accountPeriodNo;
	}
	@Column(name="DEPT_CODE")
	public String getDeptCode() {
		return deptCode;
	}
	@Column(name="DEPT_CODE")
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	@Column(name="SLIP_TYPE")
	public String getSlipType() {
		return slipType;
	}
	@Column(name="SLIP_TYPE")
	public void setSlipType(String slipType) {
		this.slipType = slipType;
	}
	@Column(name="EXPENSE_REPORT")
	public String getExpenseReport() {
		return expenseReport;
	}
	@Column(name="EXPENSE_REPORT")
	public void setExpenseReport(String expenseReport) {
		this.expenseReport = expenseReport;
	}
	@Column(name="AUTHORIZATION_STATUS")
	public String getAuthorizationStatus() {
		return authorizationStatus;
	}
	@Column(name="AUTHORIZATION_STATUS")
	public void setAuthorizationStatus(String authorizationStatus) {
		this.authorizationStatus = authorizationStatus;
	}
	@Column(name="REPORTING_EMP_CODE")
	public String getReportingEmpCode() {
		return reportingEmpCode;
	}
	@Column(name="REPORTING_EMP_CODE")
	public void setReportingEmpCode(String reportingEmpCode) {
		this.reportingEmpCode = reportingEmpCode;
	}
	@Column(name="REPORTING_DATE")
	public String getReportingDate() {
		return reportingDate;
	}
	@Column(name="REPORTING_DATE")
	public void setReportingDate(String reportingDate) {
		this.reportingDate = reportingDate;
	}
	@Column(name="REPORTING_TIME")
	public String getReportingTime() {
		return reportingTime;
	}
	@Column(name="REPORTING_TIME")
	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}
	@Column(name="APPROVAL_EMP_CODE")
	public String getApprovalEmpCode() {
		return approvalEmpCode;
	}
	@Column(name="APPROVAL_EMP_CODE")
	public void setApprovalEmpCode(String approvalEmpCode) {
		this.approvalEmpCode = approvalEmpCode;
	}
	@Column(name="APPROVAL_DATE")
	public String getApprovalDate() {
		return approvalDate;
	}
	@Column(name="APPROVAL_DATE")
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	@Column(name="APPROVAL_TIME")
	public String getApprovalTime() {
		return approvalTime;
	}
	@Column(name="APPROVAL_TIME")
	public void setApprovalTime(String approvalTime) {
		this.approvalTime = approvalTime;
	}
	@Column(name="MODIFYING_EMP_CODE")
	public String getModifyingEmpCode() {
		return modifyingEmpCode;
	}
	@Column(name="MODIFYING_EMP_CODE")
	public void setModifyingEmpCode(String modifyingEmpCode) {
		this.modifyingEmpCode = modifyingEmpCode;
	}
	@Column(name="MODIFYING_DATE")
	public String getModifyingDate() {
		return modifyingDate;
	}
	@Column(name="MODIFYING_DATE")
	public void setModifyingDate(String modifyingDate) {
		this.modifyingDate = modifyingDate;
	}
	@Column(name="MODIFYING_TIME")
	public String getModifyingTime() {
		return modifyingTime;
	}
	@Column(name="MODIFYING_TIME")
	public void setModifyingTime(String modifyingTime) {
		this.modifyingTime = modifyingTime;
	}

	@Column(name="SLIP_DESCRIPTION")
	public String getSlipDescription() {
		return slipDescription;
	}
	@Column(name="SLIP_DESCRIPTION")
	public void setSlipDescription(String slipDescription) {
		this.slipDescription = slipDescription;
	}

}
