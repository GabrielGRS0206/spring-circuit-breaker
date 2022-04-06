package br.com.clients.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.clients.domain.model.Client;

public interface ClientRepository extends MongoRepository<Client, String>{

}
