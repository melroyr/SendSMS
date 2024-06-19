package com.example.broadcastsmsapiwithclicksend.model;

public class ClickSendResponse {
	
	 private int http_code;
	 private String response_code;
	 private String response_msg;
	 private ClickSendData data;
	 
	public int getHttp_code() {
		return http_code;
	}
	public void setHttp_code(int http_code) {
		this.http_code = http_code;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getResponse_msg() {
		return response_msg;
	}
	public void setResponse_msg(String response_msg) {
		this.response_msg = response_msg;
	}
	public ClickSendData getData() {
		return data;
	}
	public void setData(ClickSendData data) {
		this.data = data;
	}

	 
}
