package br.com.clients.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@NotNull
	@Size(max = 120)
	@Column(length = 120,nullable = false)
	private String name;

	@NotBlank
	@NotNull
	@Size(max = 16)
	@Column(length = 16)
	private String document;

	@Size(max = 30)
	@Column(length = 30)
	private String contact;
	
	@Size(max = 100)
	@Column(length = 100)
	private String email;

	public Client() {
		super();
	}
	
	public Client(String name, String email, String document,String contact) {
		this.name = name;
		this.email = email;
		this.document = document;
		this.contact = contact;
	}
}
