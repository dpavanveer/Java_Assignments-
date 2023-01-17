package com.springrest.helloworld;

public class Helloworldbean {
	
	public Helloworldbean(String message) {
		super();
		this.message=message;
	}
	private String message;
	
	public String getMessage() {
		return message;
	}

	public String toString() {
		return "Helloworldbean [message=" + message + "]";
	}
}

