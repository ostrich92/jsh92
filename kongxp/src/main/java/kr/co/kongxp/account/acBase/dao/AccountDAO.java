package kr.co.kongxp.account.acBase.dao;

import java.util.ArrayList;

import kr.co.kongxp.account.acBase.to.AccountTO;


public interface AccountDAO {
	
	public ArrayList<AccountTO> selectAccountList();

}
