package br.com.clients.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.clients.domain.model.Client;
import br.com.clients.domain.repository.ClientRepository;
import br.com.clients.domain.service.ClienteService;
import br.com.clients.exception.MessagesUtils;
import br.com.clients.exception.model.BusinessException;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClientRepository repository;
	
	@Override
	public Client findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new BusinessException(MessagesUtils.CLIENT_ID_NOT_FOUND.getValue()));
	}
}
