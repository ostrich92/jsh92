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
import kr.co.kongxp.account.slip.to.SlipTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class SlipController{
	
	@Autowired
	private SlipServiceFacade slipServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;


	@RequestMapping("slip/getSlipTotalList.do")
	public void getSlipTotalList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getSlipTotalList 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String startDate=inData.getVariable("startDate").getString();
		String endDate=inData.getVariable("endDate").getString();

		System.out.println("startDate : " + startDate);
		System.out.println("endDate : " + endDate);
		
		List<SlipTO> slipTotalList=slipServiceFacade.getSlipTotalList(startDate,endDate);
		System.out.println(" sf -> getSlipTotalList ");

		datasetBeanMapper.beansToDataset(outData, slipTotalList, SlipTO.class);
	}

	@RequestMapping("slip/getSlipList.do") //조회
	public void getSlipList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getSlipList 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		HashMap<String, Object> slipDate = new HashMap<>();

		String startDate=inData.getVariable("startDate").getString();
		String endDate=inData.getVariable("endDate").getString();
		String slipStatus=inData.getVariable("slipStatus").getString();
		
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

		System.out.println("startDate : " + startDate);
		System.out.println("endDate : " + endDate);
		System.out.println("slipStatus : " + slipStatus);
		
		slipDate.put("startDate", startDate);
		slipDate.put("endDate", endDate);
		slipDate.put("slipStatus", slipStatus);
		
		List<SlipTO> sliplist=slipServiceFacade.getSlipList(slipDate);
		System.out.println(" sf -> getSlipList ");

		datasetBeanMapper.beansToDataset(outData, sliplist, SlipTO.class);
	}

	@RequestMapping("slip/getSlipRowCount.do") //추가
	public void getSlipRowCount(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getSlipRowCount 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String reportingDate=inData.getVariable("reportingDate").getString();
		System.out.println("reportingDate : " + reportingDate);

		List<SlipTO> slipRowCount=slipServiceFacade.getSlipRowCount(reportingDate);
		System.out.println(" sf -> getSlipRowCount ");

		datasetBeanMapper.beansToDataset(outData, slipRowCount, SlipTO.class);
	}

	@RequestMapping("slip/batchSlipInfo.do")
	public void batchSlipInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" batchSlipInfo 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		
		List<SlipTO> slipInfo = datasetBeanMapper.datasetToBeans(inData, SlipTO.class);
		//System.out.println(" SlipNo : " + slipInfo.get(0).getSlipNo());

		slipServiceFacade.batchSlipInfo(slipInfo);
		System.out.println(" batchSlipInfo 종료 ");
	}
}
