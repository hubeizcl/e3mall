package com.pyg.utils;

import java.io.Serializable;

public class PygResult implements Serializable {

	private Boolean success;

	private String massage;

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

}
