package br.com.notifications.domain.service;

import java.util.List;

import br.com.notifications.domain.exception.model.BusinessException;
import br.com.notifications.domain.model.Notification;

@FunctionalInterface
public interface NotificationService {
	List<Notification> findAllClientNotification(Long id) throws BusinessException;
}
