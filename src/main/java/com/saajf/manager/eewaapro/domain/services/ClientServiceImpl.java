package com.saajf.manager.eewaapro.domain.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saajf.manager.eewaapro.domain.entities.Client;
import com.saajf.manager.eewaapro.domain.interfaces.ClientRepositoryPort;
import com.saajf.manager.eewaapro.domain.services.interfaces.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepositoryPort clientRepositoryPort;

	@Override
	public Client createCliente(Client client) {
		return clientRepositoryPort.save(client);
	}

	@Override
	public Client updateClient(Client updatedClient) {
		System.out.println(updatedClient.toString());
		Client existingClient = clientRepositoryPort.findById(updatedClient.getId())
				.orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

		existingClient.setCompanyName(updatedClient.getCompanyName());
		existingClient.setCompanyType(updatedClient.getCompanyType());
		existingClient.setCompanyAddress1(updatedClient.getCompanyAddress1());
		existingClient.setCompanyAddress2(updatedClient.getCompanyAddress2());
		existingClient.setCompanyPhone1(updatedClient.getCompanyPhone1());
		existingClient.setCompanyPhone2(updatedClient.getCompanyPhone2());
		existingClient.setEmail(updatedClient.getEmail());
		existingClient.setSuscripciones(updatedClient.getSuscripciones());

		return clientRepositoryPort.save(existingClient);
	}

	@Override
	public Client findById(Long id) {
		return clientRepositoryPort.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Client> findAll() {
		return (List<Client>) Optional.ofNullable(clientRepositoryPort.findAll()).orElse(Collections.emptyList());
	}

}
