package kr.co.kongxp.account.acBase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.account.acBase.sf.AcBaseServiceFacade;
import kr.co.kongxp.account.acBase.to.CustomerTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller
public class CustomerController {

	@Autowired
	private AcBaseServiceFacade acBaseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	
	@RequestMapping("acbase/getTotalCustomerList.do")
	public void getTotalCustomerList(HttpServletRequest request, HttpServletResponse response) throws Exception{ 
		// TODO Auto-generated method stub
		System.out.println("getTotalCustomerList 시작");

		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		List<CustomerTO> customerTO = acBaseServiceFacade.getGeneralCustomerList();
		System.out.println(" sf -> getTotalCustomerList ");
		
		datasetBeanMapper.beansToDataset(outData, customerTO, CustomerTO.class);
	}

	@RequestMapping("acbase/batchCustomer.do")
	public void batchCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub		
		System.out.println("batchCustomer 시작");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		
		List<CustomerTO> customerTO = datasetBeanMapper.datasetToBeans(inData, CustomerTO.class);
		
		System.out.println("DivisionCodeNo : " + customerTO.get(0).getCustomerCode());		
		
		acBaseServiceFacade.batchCustomer(customerTO);
	}

}
