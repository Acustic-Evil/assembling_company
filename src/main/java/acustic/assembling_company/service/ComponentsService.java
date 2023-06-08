package acustic.assembling_company.service;

import acustic.assembling_company.entity.Components;
import acustic.assembling_company.repository.IComponentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentsService {
    @Autowired
    IComponentsRepository componentsRepository;

    public List<Components> getAllComponents(){
        return componentsRepository.findAll();
    }
}
