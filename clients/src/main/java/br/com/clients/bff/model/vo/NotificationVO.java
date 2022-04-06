package br.com.clients.bff.model.vo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class NotificationVO {

	private String type;
	private String description;
	private LocalDate date;
}
