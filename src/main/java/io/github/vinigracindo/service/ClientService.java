package io.github.vinigracindo.service;

import io.github.vinigracindo.model.Client;
import io.github.vinigracindo.repository.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void create(Client client) {
        validate(client);
        this.clientRepository.save(client);
    }

    public void validate(Client client){

    }

}
