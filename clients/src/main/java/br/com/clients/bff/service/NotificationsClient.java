package br.com.clients.bff.service;

import java.util.List;

import br.com.clients.bff.model.dto.NotificationResponseDto;

@FunctionalInterface
public interface NotificationsClient {
	List<NotificationResponseDto> findByIdNotificationsClient(Long id);
}
