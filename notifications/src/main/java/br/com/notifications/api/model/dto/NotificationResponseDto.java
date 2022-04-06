package br.com.notifications.api.model.dto;

import lombok.Data;

@Data
public class NotificationResponseDto {
	
	private String id;
	private String description;
	private String date;
}
