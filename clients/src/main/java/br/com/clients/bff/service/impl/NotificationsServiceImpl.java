package br.com.clients.bff.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.clients.bff.model.dto.NotificationResponseDto;
import br.com.clients.bff.service.NotificationsService;
import br.com.clients.exception.model.BusinessException;

@Service
public class NotificationsServiceImpl implements NotificationsService{

	private final RestTemplate restTemplate;
	private static final String ERROR_REQUEST_API_NOTIFICATIONS = "Error request api notifications";

	private final static String API_URL = UriComponentsBuilder
			.fromHttpUrl("http://localhost:8091/api/notifications/")
			.queryParam("id", "{id}")
			.encode()
			.toUriString();

	public NotificationsServiceImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	public List<NotificationResponseDto> findByIdNotificationsClient(Long id) {
		return requestApiNotifications(id);
	}

	private List<NotificationResponseDto> requestApiNotifications(Long clientId) {
		final Map<String, Object> params = new HashMap<>();
		params.put("id", clientId);

		final NotificationResponseDto[] notifications;
		
		try {
			notifications = restTemplate.getForObject(API_URL, NotificationResponseDto[].class, params);
		} catch (Exception e) {
			throw new BusinessException(ERROR_REQUEST_API_NOTIFICATIONS);
		}
		
		return Arrays.asList(notifications);
	}
}
