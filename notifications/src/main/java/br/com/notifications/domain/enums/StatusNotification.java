package br.com.notifications.domain.enums;

public enum StatusNotification {

	OPEN(1),CLOSE(2);

	private Integer value;
	
	StatusNotification(Integer value) {
		this.setValue(value);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
