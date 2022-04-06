package br.com.clients.exception;

public enum MessagesUtils {

	CLIENT_ID_NOT_FOUND("client id not found");

	private String value;
	
	MessagesUtils(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
