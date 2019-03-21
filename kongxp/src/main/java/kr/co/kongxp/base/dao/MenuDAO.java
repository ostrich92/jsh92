package kr.co.kongxp.base.dao;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.kongxp.base.to.UserMenuTO;
import kr.co.kongxp.common.exception.DataAccessException;

public interface MenuDAO {

	public ArrayList<UserMenuTO> selectUserMenuCodeList(HashMap<String, Object> empInformation) throws DataAccessException;

}