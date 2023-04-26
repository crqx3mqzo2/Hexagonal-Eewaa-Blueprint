package com.saajf.manager.eewaapro.domain.interfaces.repositories;

import org.springframework.data.repository.CrudRepository;

import com.saajf.manager.eewaapro.domain.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

	Client findByEmail(String email);

}
