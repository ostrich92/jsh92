package com.unicompany.base.applicationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.unicompany.base.dao.MenuDAO;
import com.unicompany.base.to.MenuBean;

@Component
public class MenuAppServiceImpl implements MenuAppService {

	@Autowired
	private MenuDAO menuDAO;
	

	@Override
	/* menu 목록을 가져오는 메서드 */
	public List<MenuBean> findMenuList() {
		return menuDAO.selectMenuList();
	}
}
