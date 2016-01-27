package com.love.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.love.main.entity.Menu;
import com.love.model.MenuAttributesModel;
import com.love.model.MenuModel;
import com.love.repository.MenuRepository;

/**
 * 菜单service
 * @author LJJ 2016年1月22日 下午2:35:04
 *
 */
@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;

	
	public String getMenu(String role){
//		List<Menu> menus=menuRepository.findAllMenusByRole(role);
		List<Menu> menus=menuRepository.findAll();
		List<MenuModel> menuModels=new ArrayList<MenuModel>();
		List<MenuModel> result=new ArrayList<MenuModel>();
		for (Menu menu : menus) {
			
			MenuModel menuModel=new MenuModel();
			MenuAttributesModel menuAttributesModel=new MenuAttributesModel();
			menuAttributesModel.setUrl(menu.getUrl());
			menuAttributesModel.setRole(menu.getRole());
			menuAttributesModel.setDeleted(menu.getDeleted());
			menuAttributesModel.setParentId(menu.getParentId());
			menuModel.setAttributes(menuAttributesModel);
			menuModel.setChecked(false);
			menuModel.setIconCls("icon-save");
			menuModel.setId(Long.valueOf(menu.getuId()));
			menuModel.setState("open");
			menuModel.setText(menu.getName());
			menuModels.add(menuModel);
		}
		
		for (MenuModel menuModel : menuModels) {
			for (MenuModel menuModel2 : menuModels) {
				if(menuModel2.getAttributes().getParentId()!=null){
					if(menuModel2.getAttributes().getParentId().equals(menuModel.getId().toString())){
						List<MenuModel> childrens=new ArrayList<MenuModel>();
								if(menuModel.getChildren()!=null){
									childrens=menuModel.getChildren();
								};
						childrens.add(menuModel2);
						menuModel.setChildren(childrens);
					}
				}
			}
		}
		
		for (MenuModel menuModel : menuModels) {
			if(menuModel.getAttributes().getParentId()==null){
				result.add(menuModel);
			}
		}
		
		return JSON.toJSONString(result);
	}
	
	public MenuRepository getMenuRepository() {
		return menuRepository;
	}

	public void setMenuRepository(MenuRepository menuRepository) {
		this.menuRepository = menuRepository;
	}
	
}
