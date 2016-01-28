package com.love.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

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

	public List<Dictionary> dictionaries(){
		return dictionaryRepository.findAll();
	}

	public DictionaryRepository getDictionaryRepository() {
		return dictionaryRepository;
	}

	public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
		this.dictionaryRepository = dictionaryRepository;
	}

}
