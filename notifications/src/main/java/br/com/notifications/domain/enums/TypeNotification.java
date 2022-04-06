package br.com.notifications.domain.enums;

public enum TypeNotification {

	ALERT("Alert"),INFORMATION("Information");

	private String value;
	
	TypeNotification(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
