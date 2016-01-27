package com.love.model;

import java.util.List;

import com.love.main.base.BaseModel;

/**影片目录
 * @author LJJ 2016年1月26日 下午3:27:13
 *
 */
public class VideoModel extends BaseModel{

	private static final long serialVersionUID = 1L;

	private Long id;
	private String text;
	private String state;
	private VideoAttributesModel attributes;
	private Boolean checked;
	private String iconCls;
	private List<VideoModel> children;
	

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
	public VideoAttributesModel getAttributes() {
		return attributes;
	}
	public void setAttributes(VideoAttributesModel attributes) {
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
	public List<VideoModel> getChildren() {
		return children;
	}
	public void setChildren(List<VideoModel> children) {
		this.children = children;
	}

	
	
}
