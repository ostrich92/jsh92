package kr.co.kongxp.account.statement.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.statement.sf.StatementServiceFacade;
import kr.co.kongxp.account.statement.to.FinancialStatementsTO;
import kr.co.kongxp.account.statement.to.IncomeStatementTO;
import kr.co.kongxp.account.statement.to.eFinancialStatementsTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class IncomeStatementController {

	@Autowired
	private StatementServiceFacade statementServiceFacade;
	
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	@RequestMapping("statement/findFinancialStatements.do")		
	public void findFinancialStatements(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" findFinancialStatements 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");

		HashMap<String, Object> apdate = new HashMap<>();
		
		String approvalDate = inData.getVariable("approvalDate").getString();
		if(approvalDate.equals("")) {
			
		} else {
	    	String a1=approvalDate.substring(0,4);
	    	String a2=approvalDate.substring(4,6);
	    	String a3=approvalDate.substring(6,8);
	    	approvalDate=a1+"-"+a2+"-"+a3;
	    	System.out.println("날짜확인"+approvalDate);
		}
		
		apdate.put("approvalDate", approvalDate);
		
		System.out.println(" approvalDate : " + approvalDate);
		
		statementServiceFacade.getFinancialStatements(apdate);
		List<FinancialStatementsTO> financialStatementsBeanList = (List<FinancialStatementsTO>)apdate.get("result");
		List<eFinancialStatementsTO> einancialStatementsBeanList = statementServiceFacade.getEFinancialStatements();
		System.out.println(" sf -> findFinancialStatements ");

		datasetBeanMapper.beansToDataset(outData, financialStatementsBeanList, FinancialStatementsTO.class);
		datasetBeanMapper.beansToDataset(outData, einancialStatementsBeanList, eFinancialStatementsTO.class);
	}

	@RequestMapping("statement/findIncomeStatement.do")		
	public void findIncomeStatement(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" findIncomeStatement 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String approvalDate = inData.getVariable("approvalDate").getString();
		System.out.println(" approvalDate : " + approvalDate);

		List<IncomeStatementTO> incomeStatementBeanList = statementServiceFacade.getIncomeStatement(approvalDate);
		System.out.println(" sf -> findIncomeStatement ");

		datasetBeanMapper.beansToDataset(outData, incomeStatementBeanList, IncomeStatementTO.class);
	}
	
}
