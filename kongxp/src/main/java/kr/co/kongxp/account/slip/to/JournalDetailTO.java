package kr.co.kongxp.account.slip.to;

import kr.co.kongxp.common.annotation.Column;
import kr.co.kongxp.common.annotation.Dataset;
import kr.co.kongxp.common.to.BaseTO;

@Dataset(name="gds_journalDetail")
public class JournalDetailTO extends BaseTO{
	private String journaldetailNO,journalNo, item, value, journaldetailDescription,
	item1, value1, item2, value2, item3, value3, item4, value4;

	@Column(name="JOURNAL_DETAIL_NO")
	public String getJournaldetailNO() {
		return journaldetailNO;
	}
	@Column(name="JOURNAL_DETAIL_NO")
	public void setJournaldetailNO(String journaldetailNO) {
		this.journaldetailNO = journaldetailNO;
	}
	@Column(name="JOURNAL_NO")
	public String getJournalNo() {
		return journalNo;
	}
	@Column(name="JOURNAL_NO")
	public void setJournalNo(String journalNo) {
		this.journalNo = journalNo;
	}
	@Column(name="ITEM")
	public String getItem() {
		return item;
	}
	@Column(name="ITEM")
	public void setItem(String item) {
		this.item = item;
	}

	@Column(name="VALUE")
	public String getValue() {
		return value;
	}

	@Column(name="VALUE")
	public void setValue(String value) {
		this.value = value;
	}

	@Column(name="JOURNAL_DETAIL_DESCRIPTION")
	public String getJournaldetailDescription() {
		return journaldetailDescription;
	}

	@Column(name="JOURNAL_DETAIL_DESCRIPTION")
	public void setJournaldetailDescription(String journaldetailDescription) {
		this.journaldetailDescription = journaldetailDescription;
	}

	@Column(name="ITEM1")
	public String getItem1() {
		return item1;
	}
	
	public void setItem1(String item1) {
		this.item1 = item1;
	}

	@Column(name="VALUE1")
	public String getValue1() {
		return value1;
	}
	
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	
	@Column(name="ITEM2")
	public String getItem2() {
		return item2;
	}
	
	public void setItem2(String item2) {
		this.item2 = item2;
	}

	@Column(name="VALUE2")
	public String getValue2() {
		return value2;
	}
	
	public void setValue2(String value2) {
		this.value2 = value2;
	}

	@Column(name="ITEM3")
	public String getItem3() {
		return item3;
	}
	
	public void setItem3(String item3) {
		this.item3 = item3;
	}

	@Column(name="VALUE3")
	public String getValue3() {
		return value3;
	}
	
	public void setValue3(String value3) {
		this.value3 = value3;
	}

	@Column(name="ITEM4")
	public String getItem4() {
		return item4;
	}
	
	public void setItem4(String item4) {
		this.item4 = item4;
	}

	@Column(name="VALUE4")
	public String getValue4() {
		return value4;
	}
	
	public void setValue4(String value4) {
		this.value4 = value4;
	}
	
}
