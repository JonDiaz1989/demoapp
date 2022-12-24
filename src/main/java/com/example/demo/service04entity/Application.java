package com.example.demo.service04entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Application {

	private String application;
	private String platform;
	private String product;
	private String version;
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Application [application=" + application + ", platform=" + platform + ", product=" + product
				+ ", version=" + version + "]";
	}
	
	@JsonCreator
	public Application(@JsonProperty("application") String application,@JsonProperty("platform") String platform,@JsonProperty("product") String product,@JsonProperty("version") String version) {
		super();
		this.application = application;
		this.platform = platform;
		this.product = product;
		this.version = version;
	}
	
	
}
