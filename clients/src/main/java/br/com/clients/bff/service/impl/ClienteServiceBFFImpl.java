package br.com.clients.bff.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import br.com.clients.bff.model.dto.ClientResponseDto;
import br.com.clients.bff.model.mapper.ClientMapper;
import br.com.clients.bff.service.ClienteServiceBFF;
import br.com.clients.domain.model.Client;
import br.com.clients.domain.service.ClienteService;

@Service
public class ClienteServiceBFFImpl implements ClienteServiceBFF {

	@Autowired
	private ClienteService service;
	
	@Autowired
	private ClientMapper mapper;
	
	@Override
	public List<ClientResponseDto> findAll() {
		return service.findAll()
				.stream()
				.map(e -> mapper.toEntity(e))
				.collect(Collectors.toList());
	}

	

	@Override
	public ClientResponseDto findById(String id) {
		Client entity = service.findById(id);
		return mapper.toEntity(entity);
	}

}
