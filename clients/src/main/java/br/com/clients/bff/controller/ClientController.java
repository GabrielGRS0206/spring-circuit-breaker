package br.com.clients.bff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.clients.bff.model.dto.ClientResponseDto;
import br.com.clients.bff.service.ClienteServiceBFF;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET})
@RequestMapping("/clients")
public class ClientController extends BaseController {

	@Autowired
	private ClienteServiceBFF service;

	@GetMapping
	public List<ClientResponseDto> findAll(){
		return service.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findById(@PathVariable String id) {
		return ok(service.findById(id));
	}
}
