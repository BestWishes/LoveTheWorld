package com.love.model;


/**用于返回给easyui显示的分页数据
 * @author LJJ 2016年1月29日 下午2:53:51
 *
 */
public class PageDataModel {

	/**
	 * 数据总数
	 */
	private Integer total;
	/**
	 * 当页数据
	 */
	private Object rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}

	
}
