package com.bartlett.esccontrol.BeanModel;

import com.comr.utils.Utils;

public class ResponseModel
{    
    private boolean response;
    private String message;
    private String href;
    private String function;

    public ResponseModel() {
        this.response = false;
        this.message = "Ocurrio un problema";
    }

    public void SetResponse(boolean r, String msg) {
        this.response = r;
        this.message = (r == false && Utils.isNullOrEmpty(msg) ? "Ocurrio un problema" : msg);
    }

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
    
}
