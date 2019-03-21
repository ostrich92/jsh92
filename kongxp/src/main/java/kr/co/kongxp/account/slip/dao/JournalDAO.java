package kr.co.kongxp.account.slip.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.slip.to.AccountControlDetailTO;
import kr.co.kongxp.account.slip.to.JournalDetailTO;
import kr.co.kongxp.account.slip.to.JournalTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface JournalDAO {

	//Journal
	public List<JournalTO> getJournalListForSlip(String slipNo) throws DataAccessException;
	public void insertJournalInfo(JournalTO journalTo) throws DataAccessException;
	public void deleteJournalInfo(JournalTO journalTo) throws DataAccessException;
	public void updateJournalInfo(JournalTO journalTo) throws DataAccessException;
	public List<JournalTO> getJournalList(HashMap<String, Object> journalDate) throws DataAccessException;
	
	//JournalDetail
	public List<JournalDetailTO> getJournalDetailList() throws DataAccessException;
	public List<JournalDetailTO> getJournalDetail(String journalNo) throws DataAccessException;
	public List<AccountControlDetailTO> getAccountControlDetailList(String accountCode) throws DataAccessException;
	public void insertJournalDetailInfo(JournalDetailTO journalDetailTo) throws DataAccessException;
	public void deleteJournalDetailInfo(JournalDetailTO journalDetailTo) throws DataAccessException;
	public void updateJournalDetailInfo(JournalDetailTO journalDetailTo) throws DataAccessException;
	
}
