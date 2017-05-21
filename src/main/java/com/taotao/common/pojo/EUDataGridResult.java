/**
 * 
 */
package com.taotao.common.pojo;

import java.util.List;

/**
 * <p> Description: </p>
 * dataGrid	数据类型的数据模型
 * @author fengda
 * @date 2017年2月16日 下午4:50:13
 */
public class EUDataGridResult {

	private long total;
	private List<?> rows;
	
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}
}
