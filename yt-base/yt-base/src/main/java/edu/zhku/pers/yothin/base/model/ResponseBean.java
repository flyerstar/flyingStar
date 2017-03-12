package edu.zhku.pers.yothin.base.model;

import com.fasterxml.jackson.annotation.JsonView;

public class ResponseBean {

	@JsonView(View.class)
	private String status;

	@JsonView(View.class)
	private String message;

	@JsonView(View.class)
	private Object result;

	public ResponseBean(String status, String message, Object result) {
		this.status = status;
		this.message = message;
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
