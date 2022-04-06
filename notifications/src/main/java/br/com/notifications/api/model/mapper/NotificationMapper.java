package br.com.notifications.api.model.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import br.com.notifications.api.model.dto.NotificationResponseDto;
import br.com.notifications.domain.model.Notification;

@Component
public class NotificationMapper {

	public List<NotificationResponseDto> toDto(List<Notification> list) {
		return list.stream()
				.map(e -> mapper(e))
				.collect(Collectors.toList());
	}
	
	private NotificationResponseDto mapper(Notification notification) {
		var response = new NotificationResponseDto();
		response.setId(notification.getId());
		response.setMessage(notification.getMessage());
		return response;
	}
}
