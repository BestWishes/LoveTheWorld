package com.love.model;

import com.love.main.base.BaseModel;

/**ӰƬ����model
 * @author LJJ 2016��1��26�� ����4:07:23
 *
 */
public class VideoAttributesModel extends BaseModel{

	private static final long serialVersionUID = 1L;

	private String path;
	private String type;
	private String level;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
}
