package com.saajf.manager.eewaapro.application.entrypoints.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saajf.manager.eewaapro.domain.entities.Client;
import com.saajf.manager.eewaapro.domain.services.interfaces.ClientService;

@RestController
@RequestMapping("/api/clientes")
public class ClientController {

	// forma 1 de inyectar el objeto
	/*
	 * @Autowired private ClienteService clienteService;
	 */

	// forma 2 de inyectar el objeto
	private final ClientService clienteService;

	public ClientController(ClientService clienteService) {
		this.clienteService = clienteService;
	}

	@PostMapping("/create")
	public ResponseEntity<Client> createCliente(@RequestBody Client cliente) {
		Client createdCliente = clienteService.createCliente(cliente);
		return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
	}

	@PostMapping("/modify")
	public ResponseEntity<Client> modifyClient(@RequestBody Client client) {
		Client modifiedClient = clienteService.updateClient(client);
		return new ResponseEntity<>(modifiedClient, HttpStatus.OK);
	}

}
