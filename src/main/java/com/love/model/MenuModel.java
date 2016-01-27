package com.love.model;

import java.util.List;

import com.love.main.base.BaseModel;

/**菜单model
 * @author LJJ 2016年1月22日 下午2:52:55
 *
 */
public class MenuModel extends BaseModel{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private String state;
	private MenuAttributesModel attributes;
	private Boolean checked;
	private String iconCls;
	private List<MenuModel> children;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public MenuAttributesModel getAttributes() {
		return attributes;
	}
	public void setAttributes(MenuAttributesModel attributes) {
		this.attributes = attributes;
	}
	public Boolean getChecked() {
		return checked;
	}
	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public List<MenuModel> getChildren() {
		return children;
	}
	public void setChildren(List<MenuModel> children) {
		this.children = children;
	}

	
	
}
