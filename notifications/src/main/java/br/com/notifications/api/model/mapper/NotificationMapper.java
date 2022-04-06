package br.com.notifications.api.model.mapper;

import org.springframework.stereotype.Component;

import br.com.notifications.api.model.dto.NotificationResponseDto;
import br.com.notifications.domain.model.Notification;

@Component
public class NotificationMapper {

	public NotificationResponseDto toEntity(Notification entity) {
		var response = new NotificationResponseDto();
		
		//TODO realizar mapper
		return response;
	}
}
