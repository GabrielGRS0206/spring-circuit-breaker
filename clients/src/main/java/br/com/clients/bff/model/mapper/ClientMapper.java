package br.com.clients.bff.model.mapper;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import br.com.clients.bff.model.dto.ClientResponseDto;
import br.com.clients.bff.model.dto.NotificationResponseDto;
import br.com.clients.domain.model.Client;

@Component
public class ClientMapper {

	public ClientResponseDto toEntity(Client client, List<NotificationResponseDto> notifications) {
		var response = new ClientResponseDto();
		BeanUtils.copyProperties(client, response);
		response.setNotifications(notifications);
		return response;
	}
}
