package com.love.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.love.main.entity.Dictionary;
import com.love.model.PageDataModel;
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
	public String dictionary(@RequestParam(name="dictName",required=false,defaultValue="")String dictName,
			@RequestParam(name="dictValue",required=false,defaultValue="")String dictValue,
			@RequestParam(name="rows",required=true)Integer rows,
			@RequestParam(name="page",required=true)Integer page){
		
		Page<Dictionary> page2=dictionaryService.dictionaries(dictName,dictValue,rows,page);
		PageDataModel pageData=new PageDataModel();
		pageData.setRows(page2.getContent());
		pageData.setTotal(Integer.valueOf(String.valueOf(Long.valueOf(page2.getTotalElements()))));
		return JSON.toJSONString(pageData);
	}
	
	
	public DictionaryService getDictionaryService() {
		return dictionaryService;
	}

	public void setDictionaryService(DictionaryService dictionaryService) {
		this.dictionaryService = dictionaryService;
	}
	
}
