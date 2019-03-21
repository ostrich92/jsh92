package kr.co.kongxp.base.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.kongxp.base.sf.BaseServiceFacade;
import kr.co.kongxp.base.to.CodeDetailTO;
import kr.co.kongxp.base.to.CodeTO;
import kr.co.kongxp.common.mapper.DatasetBeanMapper;

@Controller 
public class CodeController {
	@Autowired
	private BaseServiceFacade baseServiceFacade;
	
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	@RequestMapping("base/findDetailCodePartList.do")
	public void findDetailCodePartList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("findDetailCodePartList 시작");
		
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String divisionCode = inData.getVariable("divisionCode").getString();
		System.out.println("divisionCode : "+divisionCode);
		
		List<CodeDetailTO> detailCodeList = baseServiceFacade.getDetailCodePartList(divisionCode);

		System.out.println("divisionCode : "+ detailCodeList.get(0).getDivisionCodeNo());
		System.out.println("SF -> empLogin");
		
		datasetBeanMapper.beansToDataset(outData, detailCodeList, CodeDetailTO.class);
	}

	@RequestMapping("base/findCodeList.do")
	public void findCodeList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		System.out.println(" findCodeList 시작");

		PlatformData outData = (PlatformData) request.getAttribute("outData");
		 
		ArrayList<CodeTO> codeList = baseServiceFacade.getCodeList();
		ArrayList<CodeDetailTO> codeDetaiList = baseServiceFacade.getCodeDetailList();
		System.out.println(" sf -> findCodeList ");
		System.out.println("codeList : " + codeList);

		datasetBeanMapper.beansToDataset(outData, codeList, CodeTO.class);
		datasetBeanMapper.beansToDataset(outData, codeDetaiList, CodeDetailTO.class);
	}

	@RequestMapping("base/batchCodeList.do")
	public void batchCodeList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub		
		System.out.println(" batchCodeList 시작");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		
		List<CodeTO> codeList = datasetBeanMapper.datasetToBeans(inData, CodeTO.class);
		List<CodeDetailTO> codeDetailList = datasetBeanMapper.datasetToBeans(inData, CodeDetailTO.class);
		
		Map<String, Object> batchCodeList = new HashMap<>();

		System.out.println("DivisionCodeNo : " + codeList.get(0).getDivisionCodeNo());
		System.out.println("DivisionCodeName : " + codeList.get(0).getDivisionCodeName());
		System.out.println("CodeChangeAvailable : " + codeList.get(0).getCodeChangeAvailable());
		
		System.out.println("DivisionCodeDetailNo : " + codeDetailList.get(0).getDivisionCodeNo());
		System.out.println("DetailCode : " + codeDetailList.get(0).getDetailCode());
		System.out.println("DetailCodeName : " + codeDetailList.get(0).getDetailCodeName());
		System.out.println("CodeUseCheck : " + codeDetailList.get(0).getCodeUseCheck());
		
		batchCodeList.put("codeList", codeList);
		batchCodeList.put("codeDetailList", codeDetailList);
		
		baseServiceFacade.batchCodeList(batchCodeList);
		findCodeList(request, response);
	}

	@RequestMapping("base/findCodeDetailList.do")
	public void findCodeDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub		
		System.out.println("findCodeDetailList 시작");

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		String codeDetail = inData.getVariable("codeDetail").getString();
		System.out.println("codeDetail : " + codeDetail);
		
		List<CodeDetailTO> codeDetailList = baseServiceFacade.findCodeDetailList(codeDetail);

		System.out.println("SF -> findCodeDetailList");
		
		datasetBeanMapper.beansToDataset(outData, codeDetailList, CodeDetailTO.class);
	}
}
