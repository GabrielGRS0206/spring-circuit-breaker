package br.com.notifications.domain.model;

import lombok.Data;

@Data
public class Notification {
	
	private long id;
	private String clientId;
	private String status;
	private String notification;
}
