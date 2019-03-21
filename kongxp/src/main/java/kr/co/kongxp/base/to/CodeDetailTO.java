package kr.co.kongxp.base.to;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name = "gds_codeDetail")
public class CodeDetailTO extends BaseTO {
	private String divisionCodeNo;
	private String description;
	private String detailCode;
	private String codeUseCheck;
	private String detailCodeName;

	@Column(name = "DIVISION_CODE_NO")
	public String getDivisionCodeNo() {
		return divisionCodeNo;
	}

	public void setDivisionCodeNo(String divisionCodeNo) {
		this.divisionCodeNo = divisionCodeNo;
	}

	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "DETAIL_CODE")
	public String getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	@Column(name = "CODE_USE_CHECK")
	public String getCodeUseCheck() {
		return codeUseCheck;
	}

	public void setCodeUseCheck(String codeUseCheck) {
		this.codeUseCheck = codeUseCheck;
	}

	@Column(name = "DETAIL_CODE_NAME")
	public String getDetailCodeName() {
		return detailCodeName;
	}

	public void setDetailCodeName(String detailCodeName) {
		this.detailCodeName = detailCodeName;
	}
}