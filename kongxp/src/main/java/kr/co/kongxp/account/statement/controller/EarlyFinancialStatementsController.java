package kr.co.kongxp.account.statement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.statement.sf.StatementServiceFacade;
import kr.co.kongxp.account.statement.to.EarlyAssetsCountTO;
import kr.co.kongxp.account.statement.to.EarlyFinancialStatementsTO;
import kr.co.kongxp.account.statement.to.EarlyLiabilitiesAndCapitalCountTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class EarlyFinancialStatementsController {
	
	@Autowired
	private StatementServiceFacade statementServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	@RequestMapping("statement/getComputeEarlyFinancialStatements.do")	
	public void getComputeEarlyFinancialStatements(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" getComputeEarlyFinancialStatements 시작 ");

		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		List<EarlyAssetsCountTO> earlyAssetsCountTO = statementServiceFacade.getComputeAssets();
		List<EarlyLiabilitiesAndCapitalCountTO> earlyLiabilitiesAndCapitalCountTO = statementServiceFacade.getComputeLiabilitiesAndCapital();
		List<EarlyFinancialStatementsTO> earlyFinancialStatementsTO = statementServiceFacade.getComputeEarlyFinancialStatements();
		System.out.println("SF -> getComputeEarlyFinancialStatements");
		
		datasetBeanMapper.beansToDataset(outData, earlyAssetsCountTO, EarlyAssetsCountTO.class);	
		datasetBeanMapper.beansToDataset(outData, earlyLiabilitiesAndCapitalCountTO, EarlyLiabilitiesAndCapitalCountTO.class);	
		datasetBeanMapper.beansToDataset(outData, earlyFinancialStatementsTO, EarlyFinancialStatementsTO.class);
		}
}
