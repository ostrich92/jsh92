package kr.co.kongxp.base.to;

import java.util.ArrayList;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name="gds_code")
public class CodeTO extends BaseTO{
	private String divisionCodeNo;
	 private String codeType;
	 private String codeChangeAvailable;
	 private String description;
	 private String divisionCodeName;
	 private ArrayList<CodeDetailTO> codeDetailBeanList;


	@Column(name = "DIVISION_CODE_NO")
	 public String getDivisionCodeNo() { 
		 return divisionCodeNo;
	 }
	
	 public void setDivisionCodeNo(String divisionCodeNo) { 
		 this.divisionCodeNo = divisionCodeNo;
	 }
	 
	 @Column(name = "CODE_TYPE")
	 public String getCodeType() { 
		 return codeType;
	 }
	 
	 public void setCodeType(String codeType) { 
		 this.codeType = codeType;
	 }

	 @Column(name = "CODE_CHANGE_AVAILABLE")
	 public String getCodeChangeAvailable() { 
		 return codeChangeAvailable;
	 }
	 
	 public void setCodeChangeAvailable(String codeChangeAvailable) { 
		 this.codeChangeAvailable = codeChangeAvailable;
	 }

	 @Column(name = "DESCRIPTION")
	 public String getDescription() { 
		 return description;
	 }
	 
	 public void setDescription(String description) { 
		 this.description = description;
	 }

	 @Column(name = "DIVISION_CODE_NAME")
	 public String getDivisionCodeName() { 
		 return divisionCodeName;
	 }
	 
	 public void setDivisionCodeName(String divisionCodeName) { 
		 this.divisionCodeName = divisionCodeName;
	 }

	public ArrayList<CodeDetailTO> getCodeDetailBeanList() {
		return codeDetailBeanList;
	}
	 
	public void setCodeDetailBeanList(ArrayList<CodeDetailTO> codeDetailBeanList) {
		this.codeDetailBeanList = codeDetailBeanList;
	}

	 
	 
}