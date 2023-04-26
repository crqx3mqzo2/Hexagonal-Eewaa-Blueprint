package com.saajf.manager.eewaapro.domain.adapter;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.saajf.manager.eewaapro.domain.entities.Client;
import com.saajf.manager.eewaapro.domain.interfaces.ClientRepositoryPort;
import com.saajf.manager.eewaapro.domain.interfaces.repositories.ClientRepository;

@Component
public class ClientAdapterImpl implements ClientRepositoryPort {

	@Autowired
	ClientRepository clientRepository;

	@Override
	public Client findByEmail(String email) {
		return clientRepository.findByEmail(email);

	}

	@Override
	public Optional<Client> findById(Long id) {
		return clientRepository.findById(id);
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public List<Client> findAll() {
		return (List<Client>) clientRepository.findAll();
	}

}
