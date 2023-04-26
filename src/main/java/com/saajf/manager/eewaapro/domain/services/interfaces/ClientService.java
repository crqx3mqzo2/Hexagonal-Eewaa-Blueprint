package com.saajf.manager.eewaapro.domain.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saajf.manager.eewaapro.domain.entities.Client;

@Service
public interface ClientService {

	Client createCliente(Client cliente);

	Client updateClient(Client updatedCliente);

	Client findById(Long id);

	List<Client> findAll();
}
