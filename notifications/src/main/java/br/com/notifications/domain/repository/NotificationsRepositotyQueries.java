package br.com.notifications.domain.repository;

import java.util.List;

import br.com.notifications.domain.model.Notification;

@FunctionalInterface
public interface NotificationsRepositotyQueries {
	List<Notification> findByIdNotificationsOpen(Long id);
}
