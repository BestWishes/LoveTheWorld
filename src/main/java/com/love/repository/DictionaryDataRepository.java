package com.love.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.DictionaryData;

@Repository
public interface DictionaryDataRepository extends JpaRepository<DictionaryData, Long>{
	
	public List<DictionaryData> findAllByDictValue(String dictValue);
}
