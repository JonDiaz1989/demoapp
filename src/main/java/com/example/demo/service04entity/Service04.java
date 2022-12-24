package com.example.demo.service04entity;

public class Service04 {
	private Input input;
	private Security security;
	
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}
	public Security getSecurity() {
		return security;
	}
	public void setSecurity(Security security) {
		this.security = security;
	}
	public Service04(Input input, Security security) {
		super();
		this.input = input;
		this.security = security;
	}
	@Override
	public String toString() {
		return "Service04 [input=" + input + ", security=" + security + "]";
	}

	
}
