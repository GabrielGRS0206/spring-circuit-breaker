package br.com.clients.bff.model.dto;

import lombok.Data;

@Data
public class ClientResponseDto {
	private Long id;
	private String name;
	private String email;
	private String document;
}
