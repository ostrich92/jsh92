package kr.co.kongxp.account.slip.sf;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kongxp.account.slip.applicationService.SlipApplicationService;
import kr.co.kongxp.account.slip.to.AccountControlDetailTO;
import kr.co.kongxp.account.slip.to.JournalDetailTO;
import kr.co.kongxp.account.slip.to.JournalTO;
import kr.co.kongxp.account.slip.to.SlipTO;
import kr.co.kongxp.common.exception.DataAccessException;

@Service
public class SlipServiceFacadeImpl implements SlipServiceFacade{

	@Autowired
	private SlipApplicationService slipApplicationService;
	
	
	@Override
	public List<SlipTO> getSlipTotalList(String startDate,String endDate) throws DataAccessException {
		// TODO Auto-generated method stub
		List<SlipTO> slip=slipApplicationService.getSlipTotalList(startDate,endDate);
		return slip;
	}
	
	@Override
	public List<SlipTO> getSlipList(HashMap<String, Object> slipDate) {
		// TODO Auto-generated method stub
		List<SlipTO> slipList=slipApplicationService.getSlipLsit(slipDate);
		return slipList;
	}


	@Override
	public List<SlipTO> getSlipRowCount(String reportingDate) {
		// TODO Auto-generated method stub
		List<SlipTO> slipRowCount=slipApplicationService.getSlipRowCount(reportingDate);
		return slipRowCount;
	}

	@Override
	public void batchSlipInfo(List<SlipTO> slipInfo) {
		// TODO Auto-generated method stub
		slipApplicationService.batchSlipInfo(slipInfo);		
	}

	
	@Override
	public List<JournalTO> getJournalListForSlip(String slipNo) {
		// TODO Auto-generated method stub
		System.out.println("aaa");
		List<JournalTO> journalListForSlip = slipApplicationService.getJournalListForSlip(slipNo);
		return journalListForSlip;
	}


	@Override
	public void batchJournalInfo(List<JournalTO> journalInfo) {
		// TODO Auto-generated method stub
		slipApplicationService.batchJournalInfo(journalInfo);		
	}


	@Override
	public List<JournalTO> getJournalList(HashMap<String, Object> journalDate) {
		// TODO Auto-generated method stub
		List<JournalTO> journalList = slipApplicationService.getJournalList(journalDate);
		return journalList;
	}


	@Override
	public List<JournalDetailTO> getJournalDetailList() throws DataAccessException {
		// TODO Auto-generated method stub
		List<JournalDetailTO> journalDetailList=slipApplicationService.getJournalDetailList();
		return journalDetailList;
	}
	
	
	@Override
	public List<JournalDetailTO> getJournalDetail(String journalNo) throws DataAccessException {
		// TODO Auto-generated method stub
		List<JournalDetailTO> journalDetail=slipApplicationService.getJournalDetail(journalNo);
		return journalDetail;
	}


	@Override
	public List<AccountControlDetailTO> getAccountControlDetailList(String accountCode) throws DataAccessException {
		// TODO Auto-generated method stub
		List<AccountControlDetailTO> accountControlDetailList=slipApplicationService.getAccountControlDetailList(accountCode);
		return accountControlDetailList;
	}


	@Override
	public void batchJournalDetailInfo(List<JournalDetailTO> journalDetailList) {
		// TODO Auto-generated method stub
		slipApplicationService.batchJournalDetailInfo(journalDetailList);				
	}

}
