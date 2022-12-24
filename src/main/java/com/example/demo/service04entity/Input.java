package com.example.demo.service04entity;

public class Input {
	
	protected Application application;
	protected Parameters parameters;
	protected subjectCodes subjectcodes;
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public Parameters getParameters() {
		return parameters;
	}
	public void setParameters(Parameters parameters) {
		this.parameters = parameters;
	}
	public subjectCodes getSubjectcodes() {
		return subjectcodes;
	}
	public void setSubjectcodes(subjectCodes subjectcodes) {
		this.subjectcodes = subjectcodes;
	}
	@Override
	public String toString() {
		return "Input [application=" + application + ", parameters=" + parameters + ", subjectcodes=" + subjectcodes
				+ "]";
	}
	public Input(Application application, Parameters parameters, subjectCodes subjectcodes) {
		super();
		this.application = application;
		this.parameters = parameters;
		this.subjectcodes = subjectcodes;
	}
	
	

}
