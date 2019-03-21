package kr.co.kongxp.account.slip.sf;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.slip.to.AccountControlDetailTO;
import kr.co.kongxp.account.slip.to.JournalDetailTO;
import kr.co.kongxp.account.slip.to.JournalTO;
import kr.co.kongxp.account.slip.to.SlipTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface SlipServiceFacade {

	//Slip
	public List<SlipTO> getSlipTotalList(String startDate,String endDate) throws DataAccessException;
	public List<SlipTO> getSlipList(HashMap<String, Object> slipDate);
	public List<SlipTO> getSlipRowCount( String reportingDate);
	public void batchSlipInfo(List<SlipTO> slipInfo);
	
	//Journal
	public List<JournalTO> getJournalListForSlip(String slipNo);
	public void batchJournalInfo(List<JournalTO> journalInfo);
	public List<JournalTO> getJournalList(HashMap<String, Object> journalDate);
	
	//JournalDetail
	public List<JournalDetailTO> getJournalDetailList() throws DataAccessException;
	public List<JournalDetailTO> getJournalDetail(String journalNo) throws DataAccessException;
	public List<AccountControlDetailTO> getAccountControlDetailList(String accountCode) throws DataAccessException;
	public void batchJournalDetailInfo(List<JournalDetailTO> journalDetailList);
}
