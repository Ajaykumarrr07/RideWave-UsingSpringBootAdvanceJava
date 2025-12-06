package com.alpha.DemoRideWave;

public class ResponceStructure<T> {
	private int StatusCode;
	private String Message;
	private T data;
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponceStructure [StatusCode=" + StatusCode + ", Message=" + Message + ", data=" + data + "]";
	}
	public ResponceStructure(int statusCode, String message, T data) {
		super();
		StatusCode = statusCode;
		Message = message;
		this.data = data;
	}
	public ResponceStructure() {
		super();
	}
	
	
	

}
