package com.love.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.love.main.entity.User;

/**
 * 用户repository
 * @author LJJ 2016年1月20日 上午10:30:57
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User getByUIdAndPassword(String uId,String password);
}
