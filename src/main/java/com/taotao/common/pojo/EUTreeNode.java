/**
 * 
 */
package com.taotao.common.pojo;

/**
 * <p> Description: 
 * 		easyUI树形控件节点格式
 * </p>
 * @author fengda
 * @date 2017年2月17日 上午9:27:32
 */
public class EUTreeNode {

	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
}
