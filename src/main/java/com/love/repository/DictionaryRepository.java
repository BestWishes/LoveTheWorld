package com.love.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.Dictionary;

/**�����ֵ�repository
 * @author LJJ 2016��1��28�� ����5:30:22
 *
 */
@Repository
public interface DictionaryRepository extends JpaRepository<Dictionary, Long> {

}