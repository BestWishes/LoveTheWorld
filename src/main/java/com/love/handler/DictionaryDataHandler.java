package com.love.handler;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.love.main.entity.DictionaryData;
import com.love.service.DictionaryDataService;

@Controller
public class DictionaryDataHandler {

	@Autowired
	private DictionaryDataService dictionaryDataService;

	@RequestMapping(value="/dictionaryData")
	public String list(@RequestParam(value="pageNo",required=false,defaultValue="1") String pageNoString,Map<String, Object> map){
		
		int pageNo=1;
		try {
			pageNo=Integer.parseInt(pageNoString);
			if(pageNo<1){
				pageNo=1;
			}
		} catch (Exception e) {
			
		}
		
		Page<DictionaryData> page=dictionaryDataService.getPage(pageNo, 10);
		map.put("page", page);
		return "comm/platform/platform";
	}
	
	@ResponseBody
	@RequestMapping("/dictDataList")
	public String getListByDictValue(String dictValue){
		return JSON.toJSONString(this.dictionaryDataService.findAllByDictValue(dictValue));
	}
	
	
	public DictionaryDataService getDictionaryDataService() {
		return dictionaryDataService;
	}

	public void setDictionaryDataService(DictionaryDataService dictionaryDataService) {
		this.dictionaryDataService = dictionaryDataService;
	}
	
	
}
