package com.hireright.chanllenge.controller.filter.entity;

import java.io.Serializable;
import java.util.Map;

public class LoggingRequest implements Serializable {

	private static final long serialVersionUID = -4702574169916528738L;

	private String sender;

	private String method;

	private String path;

	private Map<String, String> params;

	private Map<String, String> headers;

	private String body;

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
