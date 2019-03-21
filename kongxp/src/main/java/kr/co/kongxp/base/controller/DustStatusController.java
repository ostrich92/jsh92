package kr.co.kongxp.base.controller;

import kr.co.kongxp.base.to.DustStatusTO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;
import kr.co.kongxp.common.publicAPI.PublicDustApiBroker;

import com.tobesoft.xplatform.data.PlatformData;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DustStatusController {
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@Autowired
	private PublicDustApiBroker publicDustApiBroker;


@RequestMapping("base/findDustStatus.do")
public void findDustStatus(HttpServletRequest request, HttpServletResponse response) throws Exception {
	System.out.println("findDustStatus 시작");
   	PlatformData outData = (PlatformData) request.getAttribute("outData"); 
   
   	List<DustStatusTO> dustStatusList= publicDustApiBroker.requsetDustGrade();
    
   	datasetBeanMapper.beansToDataset(outData, dustStatusList, DustStatusTO.class);
	}

}