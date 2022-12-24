package com.example.demo.service04entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameters {

	private String maxOcurrences;

	public String getMaxOcurrences() {
		return maxOcurrences;
	}

	public void setMaxOcurrences(String maxOcurrences) {
		this.maxOcurrences = maxOcurrences;
	}

	@Override
	public String toString() {
		return "Parameters [maxOcurrences=" + maxOcurrences + "]";
	}

	@JsonCreator
	public Parameters(@JsonProperty("maxOcurrences") String maxOcurrences ) {
		super();
		this.maxOcurrences = maxOcurrences;
	}
	
	
	
}
