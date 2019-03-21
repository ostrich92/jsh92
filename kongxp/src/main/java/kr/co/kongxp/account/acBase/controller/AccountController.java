package kr.co.kongxp.account.acBase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.acBase.sf.AcBaseServiceFacade;
import kr.co.kongxp.account.acBase.to.AccountSummaryTO;
import kr.co.kongxp.account.acBase.to.AccountTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class AccountController {

	@Autowired
	private AcBaseServiceFacade acBaseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	
	@RequestMapping("acbase/getAccountList.do")
	public void getAccountList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getAccountList 시작 ");

		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		List<AccountTO> accountTO = acBaseServiceFacade.getAccountList();
		List<AccountSummaryTO> accountSummaryTO = acBaseServiceFacade.getAccountSummaryList();
		System.out.println(" sf -> getAccountList ");
		
		datasetBeanMapper.beansToDataset(outData, accountTO, AccountTO.class);
		datasetBeanMapper.beansToDataset(outData, accountSummaryTO, AccountSummaryTO.class);
	}

	@RequestMapping("acbase/modifyAccountDetailList.do")
	public void modifyAccountDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" modifyAccountDetailList 시작 ");		

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		
        List<AccountSummaryTO> accountSummaryList=datasetBeanMapper.datasetToBeans(inData , AccountSummaryTO.class );
		System.out.println(" getAccountInnerCode : " + accountSummaryList.get(0).getAccountInnerCode());	
		System.out.println(" getAccountSummaryDescription : " + accountSummaryList.get(0).getAccountSummaryDescription());	
		System.out.println(" getStatus : " + accountSummaryList.get(0).getStatus());	
		System.out.println(" sf -> modifyAccountDetailList ");
		
        acBaseServiceFacade.modifyAccountSummaryList(accountSummaryList);
	}

}
