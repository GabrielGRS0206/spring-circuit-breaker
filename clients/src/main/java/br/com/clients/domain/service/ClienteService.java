package br.com.clients.domain.service;

import java.util.List;

import br.com.clients.domain.model.Client;

public interface ClienteService {

	List<Client> findAll();
	Client findById(String id);
}
