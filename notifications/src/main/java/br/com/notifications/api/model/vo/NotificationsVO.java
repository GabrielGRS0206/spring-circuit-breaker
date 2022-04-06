package br.com.notifications.api.model.vo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class NotificationsVO {

	private String type;
	private String description;
	private LocalDate date;
}
