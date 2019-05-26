package com.fideljose.controllers;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fideljose.model.Client;
import com.fideljose.service.ClientService;
//import org.springframework.web.reactive.function.client.WebClient;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class ClientController {

//	@Autowired
//	ClientService service;
	
//	@Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    WebClient.Builder webClientBuilder;
	
	@RequestMapping("/saludo")
	public String saludo() {
		return "Hola Fidel---!!!";
	}
	
	@RequestMapping("/clientslist")
	public List<Client> getClientes() {
		
//		return service.findAll();
		return Arrays.asList(
				new Client("fidel1", "direccion1", "telefono1"),
				new Client("fidel2", "direccion2", "telefono2"),
				new Client("fidel3", "direccion3", "telefono3"),
				new Client("fidel4", "direccion4", "telefono4")
		);
	}
	
	@PostMapping("client")
	public ResponseEntity<Client> saveClient(@RequestBody Client client) {
//		Client c = service.save(client);
		Client c = new Client();
		return c.getFullName().isEmpty() ? 
				new ResponseEntity<Client>(client, HttpStatus.INTERNAL_SERVER_ERROR) 
				: new ResponseEntity<Client>(client, HttpStatus.CREATED);
	}
	
	@PutMapping("client")
	public ResponseEntity<Client> updateClient(@RequestBody Client client){
//		service.save(client);
		return new ResponseEntity<Client>(client, HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{id}")
	public boolean deleteClient(@PathVariable("id") Integer id) {
//		service.deleteById(id);
		
		return true;
	}
	
}
