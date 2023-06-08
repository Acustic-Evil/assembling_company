package acustic.assembling_company.service;

import acustic.assembling_company.entity.Assembles;
import acustic.assembling_company.repository.IAssemblesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssemblesService {
    @Autowired
    IAssemblesRepository assemblesRepository;

    public List<Assembles> getAllAssembles() {
        return assemblesRepository.findAll();
    }
}
