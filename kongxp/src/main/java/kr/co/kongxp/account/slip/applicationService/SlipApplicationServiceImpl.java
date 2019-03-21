package kr.co.kongxp.account.slip.applicationService;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.kongxp.account.slip.dao.JournalDAO;
import kr.co.kongxp.account.slip.dao.SlipDAO;
import kr.co.kongxp.account.slip.to.AccountControlDetailTO;
import kr.co.kongxp.account.slip.to.JournalDetailTO;
import kr.co.kongxp.account.slip.to.JournalTO;
import kr.co.kongxp.account.slip.to.SlipTO;
import kr.co.kongxp.common.exception.DataAccessException;

@Component
public class SlipApplicationServiceImpl implements SlipApplicationService{
	
	@Autowired
	private SlipDAO slipDAO;
	@Autowired
	private JournalDAO journalDAO;


	@Override
	public List<SlipTO> getSlipTotalList(String startDate, String endDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<SlipTO> slip=slipDAO.getSlipTotalList(startDate, endDate);
		return slip;
	}

	@Override
	public List<SlipTO> getSlipLsit(HashMap<String, Object> slipDate) {
		// TODO Auto-generated method stub
		List<SlipTO> slipList=slipDAO.getSlipList(slipDate);
		return slipList;
	}

	@Override
	public List<SlipTO> getSlipRowCount(String reportingDate) {
		// TODO Auto-generated method stub
		List<SlipTO> slipRowCount=slipDAO.getSlipRowCount(reportingDate);
		return slipRowCount;
	}

	@Override
	public void batchSlipInfo(List<SlipTO> slipInfo) {
		// TODO Auto-generated method stub
		for (SlipTO slipTo : slipInfo) {
			switch (slipTo.getStatus()) {
			case "insert":
				slipDAO.insertSlipInfo(slipTo);
				break;
			case "delete":
				slipDAO.deleteSlipInfo(slipTo);
				break;
			case "update":
				slipDAO.updateSlipInfo(slipTo);
				break;
			}
		}		
	}
	

	@Override
	public List<JournalTO> getJournalListForSlip(String slipNo) {
		// TODO Auto-generated method stub
		System.out.println("nnn");
		List<JournalTO> journalListForSlip=journalDAO.getJournalListForSlip(slipNo);
		return journalListForSlip;
	}

	@Override
	public void batchJournalInfo(List<JournalTO> journalInfo) {
		// TODO Auto-generated method stub
		for (JournalTO journalTo : journalInfo) {
			switch (journalTo.getStatus()) {
			case "insert":
				journalDAO.insertJournalInfo(journalTo);
				break;
			case "delete":
				journalDAO.deleteJournalInfo(journalTo);
				break;
			case "update":
				journalDAO.updateJournalInfo(journalTo);
				break;
			}
		}		
	}

	@Override
	public List<JournalTO> getJournalList(HashMap<String, Object> journalDate) {
		// TODO Auto-generated method stub
		List<JournalTO> journalList=journalDAO.getJournalList(journalDate);
		return journalList;
	}

	@Override
	public List<JournalDetailTO> getJournalDetailList() throws DataAccessException {
		// TODO Auto-generated method stub
		List<JournalDetailTO> journalDetailList=journalDAO.getJournalDetailList();
		return journalDetailList;
	}
	
	@Override
	public List<JournalDetailTO> getJournalDetail(String journalNo) throws DataAccessException {
		// TODO Auto-generated method stub
		List<JournalDetailTO> journalDetail=journalDAO.getJournalDetail(journalNo);
		return journalDetail;
	}

	@Override
	public List<AccountControlDetailTO> getAccountControlDetailList(String accountCode) throws DataAccessException {
		// TODO Auto-generated method stub
		List<AccountControlDetailTO> accountControlDetailList=journalDAO.getAccountControlDetailList(accountCode);
		return accountControlDetailList;
	}

	@Override
	public void batchJournalDetailInfo(List<JournalDetailTO> journalDetailList) {
		// TODO Auto-generated method stub
		for (JournalDetailTO journalDetailTO : journalDetailList) {
			switch (journalDetailTO.getStatus()) {
			case "insert":
				journalDAO.insertJournalDetailInfo(journalDetailTO);
				break;
			case "delete":
				journalDAO.deleteJournalDetailInfo(journalDetailTO);
				break;
			case "update":
				journalDAO.updateJournalDetailInfo(journalDetailTO);
				break;
			}
		}			
	}

}
