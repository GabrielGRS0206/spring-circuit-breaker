package br.com.clients.bff.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.clients.bff.model.dto.NotificationResponseDto;
import br.com.clients.bff.service.NotificationsClient;
import br.com.clients.exception.model.BusinessException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class NotificationsClientImpl implements NotificationsClient{

	private final Logger LOGGER = LoggerFactory.getLogger(NotificationsClientImpl.class);
	private final RestTemplate restTemplate;
	private static final String ERROR_REQUEST_API_NOTIFICATIONS = "Error request api notifications";

	private final Map<Long, List<NotificationResponseDto>> CACHE = new HashMap<>();
	
	private final static String API_URL = UriComponentsBuilder
			.fromHttpUrl("http://localhost:8091/api/notifications/")
			.queryParam("id", "{id}")
			.encode()
			.toUriString();

	public NotificationsClientImpl(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}

	@Override
	@CircuitBreaker(name = "notificationsApi", fallbackMethod = "findByIdNotificationsClientCache" )
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
		
		CACHE.put(clientId, Arrays.asList(notifications));
		
		return Arrays.asList(notifications);
	}
	
	public List<NotificationResponseDto> findByIdNotificationsClientCache(Long id, Throwable e) {
		return CACHE.getOrDefault(id, new ArrayList<NotificationResponseDto>());
	}
}
