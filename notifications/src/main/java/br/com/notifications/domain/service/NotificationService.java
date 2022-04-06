package br.com.notifications.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.notifications.domain.model.Notification;
import br.com.notifications.domain.repository.NotificationRepository;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	public List<Notification> findAllClientNotification(String id){
		//TODO implementar busca de todas notificações do cliente
		
		return null;
	}
}
