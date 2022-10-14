package com.example.demo.apiResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiResponse {
	
    String message;
	
	boolean success;
	
	Map content;
	
	public ApiResponse(boolean requiredContent){
		
		message = "";
		success = false;
		
	}

	public Map getContent() {
		return content;
	}


	public void setContent(Map content) {
		this.content = content;
	}


	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String class1) {
		this.message = class1;
	}


	public boolean isSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}


	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}



	public void setContent1(List<Map> assetList) {
		// TODO Auto-generated method stub
		
	}

}
