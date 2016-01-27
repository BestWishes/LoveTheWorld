package com.love.handler;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.love.main.entity.User;
import com.love.service.UserService;
import com.love.util.Constants;

/**用户登录handler
 * @author LJJ 2016年1月20日 上午10:26:11
 *
 */
@Controller
public class UserHandler {

	@Autowired
	private UserService userService;
	private String resultJson;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(User user,HttpSession httpSession){
		User user_login=new User();
		user_login=userService.login(user.getuId(),user.getPassword());
		if(user_login==null||user_login.getId()==null){
			httpSession.removeAttribute(Constants.SESSION_USER_ID);
			httpSession.removeAttribute(Constants.SESSION_USER_NAME);
			httpSession.removeAttribute(Constants.SESSION_USER_STATUS);
			httpSession.removeAttribute(Constants.SESSION_USER_ROLE);
		}else {
			httpSession.setAttribute(Constants.SESSION_USER_ID, user_login.getId());
			httpSession.setAttribute(Constants.SESSION_USER_NAME, user_login.getName());
			httpSession.setAttribute(Constants.SESSION_USER_STATUS, user_login.getStatus());
			httpSession.setAttribute(Constants.SESSION_USER_ROLE,user_login.getRole());
		}
		return "redirect:/index.jsp";
	}
	@RequestMapping(value="/logout")
	public String logout(HttpSession httpSession){
			httpSession.removeAttribute(Constants.SESSION_USER_ID);
			httpSession.removeAttribute(Constants.SESSION_USER_NAME);
			httpSession.removeAttribute(Constants.SESSION_USER_STATUS);
			httpSession.removeAttribute(Constants.SESSION_USER_ROLE);
		return "redirect:/index.jsp";
//			return "success";
	}
	
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(User user,HttpSession httpSession){
		System.out.println(user);
		user.setVersion(0l);
		user.setCreaterId((Long)httpSession.getAttribute(Constants.SESSION_USER_ID));
		user.setCreateTime(new Date());
		userService.save(user);
		return "main/NewFile";
	}
	@RequestMapping("/register")
	public String register(User user,HttpSession httpSession){
		User user2=this.userService.save(user);
		if (user2!=null) {
			httpSession.setAttribute(Constants.SESSION_USER_ID, user.getId());
			httpSession.setAttribute(Constants.SESSION_USER_NAME, user.getName());
			httpSession.setAttribute(Constants.SESSION_USER_STATUS, user.getStatus());
			httpSession.setAttribute(Constants.SESSION_USER_ROLE,user.getRole());
		}
		return "main/main";
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getResultJson() {
		return resultJson;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}
	
}
