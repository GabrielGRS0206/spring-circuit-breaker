package br.com.clients.bff.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clients.bff.model.dto.ClientResponseDto;
import br.com.clients.bff.model.mapper.ClientMapper;
import br.com.clients.bff.service.ClienteServiceBFF;
import br.com.clients.bff.service.NotificationsService;
import br.com.clients.domain.service.ClienteService;

@Service
public class ClienteServiceBFFImpl implements ClienteServiceBFF {

	@Autowired
	private ClienteService service;
	
	@Autowired
	private ClientMapper mapper;
	
	@Autowired
	private NotificationsService notificationsService;

	@Override
	public ClientResponseDto findById(Long id) {
		return mapper.toEntity(service.findById(id), notificationsService.findByIdNotificationsClient(id));
	}
	

}
