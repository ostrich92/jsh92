package kr.co.kongxp.base.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.base.sf.BaseServiceFacade;
import kr.co.kongxp.base.to.UserMenuTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class MenuController {

	@Autowired
	private BaseServiceFacade baseServiceFacade;
	
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	
	@RequestMapping("base/getUserMenu.do")
	public void getUserMenu(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getUserMenu 시작 ");
		
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		HashMap<String, Object> empInformation = new HashMap<>();
		
		String workplaceCode = inData.getVariable("workplaceCode").getString();
		String deptCode = inData.getVariable("deptCode").getString();
		String positionCode = inData.getVariable("positionCode").getString();
	      
		System.out.println("workplaceCode : " + workplaceCode);
		System.out.println("deptCode : " + deptCode);
		System.out.println("positionCode : " + positionCode);
		
		empInformation.put("workplaceCode", workplaceCode);
		empInformation.put("deptCode", deptCode);
		empInformation.put("positionCode", positionCode);
		
		System.out.println("aa");
		
		ArrayList<UserMenuTO> userMenuTO =baseServiceFacade.getUserMenuCode(empInformation);

		System.out.println(userMenuTO);
		System.out.println(" sf -> dataset");
		
		datasetBeanMapper.beansToDataset(outData, userMenuTO, UserMenuTO.class);
	
		}
}

