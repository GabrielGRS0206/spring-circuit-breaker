package br.com.clients.bff.service;

import br.com.clients.bff.model.dto.ClientResponseDto;

public interface ClienteServiceBFF {
	ClientResponseDto findById(Long id);
}
