package br.com.notifications.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.notifications.domain.exception.model.BusinessException;
import br.com.notifications.domain.model.Notification;
import br.com.notifications.domain.repository.NotificationRepository;
import br.com.notifications.domain.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository repository;

	@Override
	public List<Notification> findAllClientNotification(Long id) throws BusinessException {
		return repository.findByIdNotificationsOpen(id);
	}
}
