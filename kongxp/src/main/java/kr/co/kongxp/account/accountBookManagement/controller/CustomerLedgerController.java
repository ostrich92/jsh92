package kr.co.kongxp.account.accountBookManagement.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.accountBookManagement.sf.AcBookManagementServiceFacade;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerDetailTO;
import kr.co.kongxp.account.accountBookManagement.to.CustomerLedgerTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class CustomerLedgerController {

	@Autowired
	private AcBookManagementServiceFacade acBookManagementServiceFacade;
	
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	
	@RequestMapping("acBookManagement/getCustomerLedgerInfo.do")
	public void getCustomerLedgerInfo(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getCustomerLedgerInfo 시작 " );
		
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		HashMap<String, Object> customerInfo = new HashMap<>();
		
		String customerCode= inData.getVariable("customerCode").getString();
		String accountCode= inData.getVariable("accountCode").getString();
		String startDate= inData.getVariable("startDate").getString();
		String endDate= inData.getVariable("endDate").getString();
		
		customerInfo.put("customerCode", customerCode);
		customerInfo.put("accountCode", accountCode);
		customerInfo.put("startDate", startDate);
		customerInfo.put("endDate", endDate);
		
		System.out.println("customerCode : " + customerCode);
		System.out.println("accountCode : " + accountCode);
		System.out.println("startDate : " + startDate);
		System.out.println("endDate : " + endDate);
		
		List<CustomerLedgerTO> customerLedgerInfo=acBookManagementServiceFacade.getCustomerLedgerInfo(customerInfo);
		System.out.println(" sf -> getCustomerLedgerInfo " );
		
		datasetBeanMapper.beansToDataset(outData, customerLedgerInfo, CustomerLedgerTO.class);
	}

	@RequestMapping("acBookManagement/getCustomerLedgerDetailInfo.do")
	public void getCustomerLedgerDetailInfo(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getCustomerLedgerDetailInfo 시작 " );

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		HashMap<String, Object> customerInfo = new HashMap<>();
		
		String customerCode= inData.getVariable("customerCode").getString();
		String accountCode= inData.getVariable("accountCode").getString();
		String startDate= inData.getVariable("startDate").getString();
		String endDate= inData.getVariable("endDate").getString();
		
		customerInfo.put("customerCode", customerCode);
		customerInfo.put("accountCode", accountCode);
		customerInfo.put("startDate", startDate);
		customerInfo.put("endDate", endDate);
		
		System.out.println("customerCode : " + customerCode);
		System.out.println("accountCode : " + accountCode);
		System.out.println("startDate : " + startDate);
		System.out.println("endDate : " + endDate);
		
		List<CustomerLedgerDetailTO> customerLedgerInfo=acBookManagementServiceFacade.getCustomerLedgerDetailInfo(customerInfo);
		System.out.println(" sf -> getCustomerLedgerDetailInfo " );
		
		datasetBeanMapper.beansToDataset(outData, customerLedgerInfo, CustomerLedgerDetailTO.class);
	}
	
}
