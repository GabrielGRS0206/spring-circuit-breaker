package br.com.notifications.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "notification")
public class Notification {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Long clientId;

	private String status;

	@NotBlank
	@Lob
	private String notification;

	public Notification() {
		super();
	}

	public Notification(Long id, Long clientId, String status, String notification) {
		this.id = id;
		this.clientId = clientId;
		this.status = status;
		this.notification = notification;
	}
}
