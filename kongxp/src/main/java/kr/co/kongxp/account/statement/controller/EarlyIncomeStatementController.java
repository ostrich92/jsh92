package kr.co.kongxp.account.statement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.statement.sf.StatementServiceFacade;
import kr.co.kongxp.account.statement.to.EarlyIncomeStatementTO;
import kr.co.kongxp.account.statement.to.EarlyrevenuesAndExpenseTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class EarlyIncomeStatementController {
	
	@Autowired
	private StatementServiceFacade statementServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	@RequestMapping("statement/getComputeEarlyIncomeStatement.do")		
	public void getComputeEarlyIncomeStatement(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getComputeEarlyIncomeStatement 시작 ");

		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		List<EarlyrevenuesAndExpenseTO> earlyrevenuesAndExpenseTO = statementServiceFacade.ComputerevenuesAndExpense();
		List<EarlyIncomeStatementTO> earlyIncomeStatementTO = statementServiceFacade.ComputeIncomeStatement();
		System.out.println(" sf -> getComputeEarlyIncomeStatement ");

		datasetBeanMapper.beansToDataset(outData, earlyrevenuesAndExpenseTO, EarlyrevenuesAndExpenseTO.class);	
		datasetBeanMapper.beansToDataset(outData, earlyIncomeStatementTO, EarlyIncomeStatementTO.class);	

		}

}
