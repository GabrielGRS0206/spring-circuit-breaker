package br.com.clients.domain.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Client {
	
	@Id
	private String id;
	private String name;
	private String email;
	private String document;
	
	public Client(String name, String email, String document) {
		this.name = name;
		this.email = email;
		this.document = document;
	}
}
