package com.love.handler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.love.service.MenuService;
import com.love.util.Constants;

@Controller
public class IndexHandler {

	private String menuJson;
	@Autowired
	private MenuService menuService;
	
	
	@RequestMapping(value="/index")
	public String index(){
		
		return "index";
	}
	@RequestMapping(value="/login_jsp")
	public String login_jsp() {
		return "user/login";
	}
	@RequestMapping(value="/head")
	public String head(){
		return "comm/platform/head";
	}
	@RequestMapping(value="/main")
	public String getMain(){
		return "main/main";
	}

	@RequestMapping(value="/getRegister")
	public String getRegister(){
		return "user/register";
	}
	
	@RequestMapping(value="/video")
	public String getVideo(){
		return "video/video";
	}
	
	@ResponseBody
	@RequestMapping("/menu")
	public String menu(HttpSession httpSession){
		String role=(String)httpSession.getAttribute(Constants.SESSION_USER_ROLE);
		if(role==null) role="";
		this.menuJson=menuService.getMenu(role);
		
		return this.menuJson;
	}
	public String getMenuJson() {
		return menuJson;
	}
	public void setMenuJson(String menuJson) {
		this.menuJson = menuJson;
	}
	public MenuService getMenuService() {
		return menuService;
	}
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}
	
}
