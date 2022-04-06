package br.com.clients.bff.service;

import java.util.List;

import br.com.clients.bff.model.dto.ClientResponseDto;

public interface ClienteServiceBFF {

	List<ClientResponseDto> findAll();
	ClientResponseDto findById(String id);
	
}
