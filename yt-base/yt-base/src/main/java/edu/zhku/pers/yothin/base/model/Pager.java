package edu.zhku.pers.yothin.base.model;

import com.fasterxml.jackson.annotation.JsonView;

public class Pager {

	@JsonView(View.class)
	private int pageSize; // 每页记录数

	@JsonView(View.class)
	private int pageNo; // 当前页码

	@JsonView(View.class)
	private int rowCount; // 查询到的总记录数

	@JsonView(View.class)
	private int pageCount; // 总页数

	@JsonView(View.class)
	private Object result; // 查询到的结果

	public Pager() {
	}

	public Pager(int pageSize, int pageNo, int rowCount, Object result) {
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.rowCount = rowCount;
		this.result = result;
		this.pageCount = rowCount % pageSize == 0 ? rowCount / pageSize : rowCount / pageSize + 1;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
}
