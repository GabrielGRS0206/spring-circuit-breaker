package br.com.notifications.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.notifications.api.model.dto.NotificationResponseDto;
import br.com.notifications.api.model.mapper.NotificationMapper;
import br.com.notifications.domain.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

	@Autowired
	private NotificationService service;
	
	@Autowired
	private NotificationMapper mapper;
	
	@GetMapping
	public List<NotificationResponseDto> findAllClientNotifications(@PathVariable String id){
		return service.findAllClientNotification(id)
				.stream()
				.map(e -> mapper.toEntity(e))
				.collect(Collectors.toList());
	}
}
