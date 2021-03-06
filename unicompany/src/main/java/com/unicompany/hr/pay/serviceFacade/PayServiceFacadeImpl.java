package com.unicompany.hr.pay.serviceFacade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicompany.common.exception.ProcedureException;
import com.unicompany.hr.pay.applicationService.PayAppService;
import com.unicompany.hr.pay.to.SalaryInputBean;

@Service
public class PayServiceFacadeImpl implements PayServiceFacade{
	/* PayAppService setting  */
	@Autowired
	private PayAppService payAppService;
	

	/* 급여를 계산하는 메서드 */
	@Override
	public List<SalaryInputBean> payCalculate(String paymentsDate, String standardDate) throws ProcedureException{
		return payAppService.payCalculate(paymentsDate, standardDate);
	}
}
