package com.love.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.love.service.DictionaryService;

/**dictionary  controller
 * @author LJJ 2016年1月28日 下午5:44:30
 *
 */
@Controller
public class DictionaryHandler {

	@Autowired
	private DictionaryService dictionaryService;

	@ResponseBody
	@RequestMapping("/dictionaries")
	public String dictionary(){
		return JSON.toJSONString(dictionaryService.dictionaries());
	}
	
	
	public DictionaryService getDictionaryService() {
		return dictionaryService;
	}

	public void setDictionaryService(DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}
	
}
