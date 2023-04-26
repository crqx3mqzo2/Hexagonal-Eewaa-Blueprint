package com.saajf.manager.eewaapro.domain.interfaces;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.saajf.manager.eewaapro.domain.entities.Client;

@Component
public interface ClientRepositoryPort {

	public Client findByEmail(String email);

	public Client save(Client client);

	public Optional<Client> findById(Long id);

	public List<Client> findAll();
}
