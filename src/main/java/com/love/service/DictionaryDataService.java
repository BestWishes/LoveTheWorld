package com.love.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.love.main.entity.DictionaryData;
import com.love.repository.DictionaryDataRepository;

@Service
public class DictionaryDataService {

	@Autowired
	private DictionaryDataRepository dictionaryDataRepository;
	
	@Transactional(readOnly=true)
	public Page<DictionaryData> getPage(int pageNo,int pageSize){
		
		PageRequest pageable=new PageRequest(pageNo-1, pageSize);
		return dictionaryDataRepository.findAll(pageable);
	}

	public DictionaryDataRepository getDictionaryDataRepository() {
		return dictionaryDataRepository;
	}

	public void setDictionaryDataRepository(
			DictionaryDataRepository dictionaryDataRepository) {
		this.dictionaryDataRepository = dictionaryDataRepository;
	}
	
	
	public List<DictionaryData> findAllByDictValue(String dictValue){
		return this.dictionaryDataRepository.findAllByDictValue(dictValue);
	};
}
