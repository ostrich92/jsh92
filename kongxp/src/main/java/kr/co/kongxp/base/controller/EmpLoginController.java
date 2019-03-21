package kr.co.kongxp.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.base.sf.BaseServiceFacade;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;
import kr.co.kongxp.hr.emp.to.EmpTO;

@Controller 
public class EmpLoginController {

	@Autowired
	private BaseServiceFacade baseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	@RequestMapping("base/empLogin.do")
	public void empLogin(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" empLogin 시작 ");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String companyCode = inData.getVariable("companyCode").getString();
		String workplaceCode = inData.getVariable("workplaceCode").getString();
		String empCode = inData.getVariable("empCode").getString();
		String userPw = inData.getVariable("userPw").getString();
		
		System.out.println("companyCode : " + companyCode);
		System.out.println("workplaceCode : " + workplaceCode);
		System.out.println("empCode : " + empCode);
		System.out.println("userPw : " + userPw);

		EmpTO empto = baseServiceFacade.loginEmployee(companyCode, workplaceCode, empCode, userPw);
		
		System.out.println(empto.getEmpName());
		System.out.println(empto.getWorkplaceCode());
		System.out.println("SF -> empLogin");
			
		datasetBeanMapper.beanToDataset(outData, empto, EmpTO.class);
	}

}

