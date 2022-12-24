package com.example.demo.service04entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class subjectCodes {
	
	private String rut;

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	@Override
	public String toString() {
		return "subjectCodes [rut=" + rut + "]";
	}

	@JsonCreator
	public subjectCodes(@JsonProperty("rut") String rut) {
		super();
		this.rut = rut;
	}

	
}
