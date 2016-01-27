package com.love.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.love.main.entity.User;
import com.love.repository.UserRepository;
import com.love.util.EncryptUtil;
import com.love.util.enums.UserRoleEnum;
import com.love.util.enums.UserStatusEnum;

/**用户service
 * @author LJJ 2016年1月20日 上午10:32:05
 *
 */
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User login(String uId,String password){
		User user=new User();
		user=userRepository.getByUIdAndPassword(uId, EncryptUtil.Encrypt(password));
		return user;
		
	}

	@Transactional
	public User save(User user){
		
		user.setPassword(EncryptUtil.Encrypt(user.getPassword()));
		user.setRole(UserRoleEnum.ADMIN.getValue());
		user.setStatus(UserStatusEnum.PASSED.getValue());
		
		user.setCreaterId(1L);
		user.setCreateTime(new Date());
		User user2=userRepository.save(user);
		
		return user2;
		
	}
	
	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
}
