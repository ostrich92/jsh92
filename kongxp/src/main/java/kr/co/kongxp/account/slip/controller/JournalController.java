package kr.co.kongxp.account.slip.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.slip.sf.SlipServiceFacade;
import kr.co.kongxp.account.slip.to.AccountControlDetailTO;
import kr.co.kongxp.account.slip.to.JournalDetailTO;
import kr.co.kongxp.account.slip.to.JournalTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class JournalController{

	@Autowired
	private SlipServiceFacade slipServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;


	@RequestMapping("slip/getJournalListForSlip.do")
	//Journal
	public void getJournalListForSlip(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getSlipCount 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String slipNo= inData.getVariable("slipNo").getString();
		System.out.println("slipNo : " + slipNo);
		
		List<JournalTO> journalList=slipServiceFacade.getJournalListForSlip(slipNo);
		System.out.println(" sf -> getSlipCount ");
		
		datasetBeanMapper.beansToDataset(outData, journalList, JournalTO.class);
	}

	@RequestMapping("slip/batchJournalInfo.do")
	public void batchJournalInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" batchJournalInfo 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		
		List<JournalTO> journalInfo = datasetBeanMapper.datasetToBeans(inData, JournalTO.class);
		System.out.println(" sf -> batchJournalInfo ");
		
		slipServiceFacade.batchJournalInfo(journalInfo);
	}

	@RequestMapping("slip/getJournalList.do")
	public void getJournalList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getJournalList 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		HashMap<String, Object> journalDate = new HashMap<>();
		
		String startDate= inData.getVariable("startDate").getString();
		String endDate= inData.getVariable("endDate").getString();
		
		if(startDate.equals("")) {
			
		} else {
	    	String a1=startDate.substring(0,4);
	    	String a2=startDate.substring(4,6);
	    	String a3=startDate.substring(6,8);
	    	startDate=a1+"-"+a2+"-"+a3;
	    	System.out.println("날짜확인"+startDate);
	    	  
	    	String b1=endDate.substring(0,4);
	    	String b2=endDate.substring(4,6);
	    	String b3=endDate.substring(6,8);
	    	endDate=b1+"-"+b2+"-"+b3;
		}
		
		journalDate.put("startDate", startDate);
		journalDate.put("endDate", endDate);
		
		System.out.println(" startDate : " + startDate);
		System.out.println(" endDate : " + endDate);
		
		
		List<JournalTO> journalList=slipServiceFacade.getJournalList(journalDate);
		System.out.println(" sf -> getJournalList ");
		System.out.println(" JournalNo : " + journalList.get(0).getJournalNo());
		
		datasetBeanMapper.beansToDataset(outData, journalList, JournalTO.class);
	}
	
	//JournalDetail
	@RequestMapping("slip/getJournalDetailList.do")
	public void getJournalDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getJournalDetailList 시작 ");

		PlatformData outData = (PlatformData) request.getAttribute("outData");
			
		List<JournalDetailTO> journalDetailList=slipServiceFacade.getJournalDetailList();
		System.out.println(" JournalNo : " +journalDetailList.get(0).getJournalNo());
		System.out.println(" sf -> getJournalDetailList ");
		
		datasetBeanMapper.beansToDataset(outData, journalDetailList, JournalDetailTO.class);
	}

	@RequestMapping("slip/getJournalDetail.do")
	public void getJournalDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getJournalDetail 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		String journalNo= inData.getVariable("jn").getString();
		
		List<JournalDetailTO> journalDetail=slipServiceFacade.getJournalDetail(journalNo);
		System.out.println(" sf -> getJournalDetail ");
		
		datasetBeanMapper.beansToDataset(outData, journalDetail, JournalDetailTO.class);
	}

	@RequestMapping("slip/getAccountControlDetailList.do")
	public void  getAccountControlDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getAccountControlDetailList 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String accountCode=inData.getVariable("ac").getString();
		System.out.println("accountCode : " + accountCode);
		
		List<AccountControlDetailTO> accountControlDetailList=slipServiceFacade.getAccountControlDetailList(accountCode);
		System.out.println(" sf -> getAccountControlDetailList ");
		for(AccountControlDetailTO an:accountControlDetailList)
			System.out.println("ControlName : "+an.getAccountcontrolName());
		
		datasetBeanMapper.beansToDataset(outData, accountControlDetailList, AccountControlDetailTO.class);
	}

	@RequestMapping("slip/batchJournalDetailList.do")
	public void batchJournalDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" batchJournalDetailList 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");

		List<JournalDetailTO> journalDetailList = datasetBeanMapper.datasetToBeans(inData, JournalDetailTO.class);
		System.out.println(" sf -> batchJournalDetailList ");
		
		slipServiceFacade.batchJournalDetailInfo(journalDetailList);
	}
}