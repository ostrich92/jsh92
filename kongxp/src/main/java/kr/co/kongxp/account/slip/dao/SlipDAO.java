package kr.co.kongxp.account.slip.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.kongxp.account.slip.to.SlipTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface SlipDAO {

	public List<SlipTO> getSlipTotalList(String startDate,String endDate) throws DataAccessException;
	public List<SlipTO> getSlipList(HashMap<String, Object> slipDate) throws DataAccessException;
	public List<SlipTO> getSlipRowCount( String reportingDate) throws DataAccessException;

	public void insertSlipInfo(SlipTO slipTo) throws DataAccessException;
	public void deleteSlipInfo(SlipTO slipTo) throws DataAccessException;
	public void updateSlipInfo(SlipTO slipTo) throws DataAccessException;

}
