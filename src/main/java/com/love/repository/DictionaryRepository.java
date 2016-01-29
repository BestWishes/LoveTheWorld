package com.love.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.Dictionary;

/**数据字典repository
 * @author LJJ 2016年1月28日 下午5:30:22
 *
 */
@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {

	public Page<Dictionary> findAllByDictNameLikeAndDictValueLike(String dictName,String dictValue,Pageable pageable);
	
}
