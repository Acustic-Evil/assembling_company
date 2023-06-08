package acustic.assembling_company.service;

import acustic.assembling_company.entity.Clients;
import acustic.assembling_company.repository.IClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService{
    @Autowired
    IClientsRepository clientsRepository;

    public List<Clients> getAllClients() {
        return clientsRepository.findAll();
    }
}
