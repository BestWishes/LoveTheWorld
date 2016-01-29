package com.love.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.love.main.entity.Dictionary;
import com.love.repository.DictionaryRepository;

/**dictionary service
 * @author LJJ 2016年1月28日 下午5:44:53
 *
 */
@Service
public class DictionaryService {

	@Autowired
	private DictionaryRepository dictionaryRepository;

	public Page<Dictionary> dictionaries(String dictName,String dictValue,Integer size,Integer page){
		if(dictName!=null){
			dictName="%"+dictName+"%";
		}
		if(dictValue!=null){
			dictValue="%"+dictValue+"%";
		}
		List<Order> orders=new ArrayList<Sort.Order>();
		orders.add(new Order("isFixed"));
		Sort sort=new Sort(orders);
		PageRequest pageRequest=new PageRequest(page-1, size, sort);
		
		return dictionaryRepository.findAllByDictNameLikeAndDictValueLike(dictName, dictValue,pageRequest);
	}

	public DictionaryRepository getDictionaryRepository() {
		return dictionaryRepository;
	}

	public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
		this.dictionaryRepository = dictionaryRepository;
	}

}
