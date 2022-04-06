package br.com.clients.domain.service.impl;

import java.util.Arrays;
import java.util.List;

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
	public List<Client> findAll() {
		return repository.findAll();
	}

	@Override
	public Client findById(String id) {
		return repository.findById(id).orElseThrow(() -> new BusinessException(MessagesUtils.CLIENT_ID_NOT_FOUND.getValue()));
	}
	
	public void mockClients() {
		List<Client> list =
				Arrays.asList(
						new Client("Gabriel Rocha","11122233344","teste@email.com"),
						new Client("João Rosa","12345432132","joao@email.com"),
						new Client("Zé Paulo","12343233344","paulo@email.com"),
						new Client("Davi matos","53233356785","davi@email.com"));
		
		list.stream().map(e -> repository.save(e));
	}

}
