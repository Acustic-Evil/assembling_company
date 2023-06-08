package acustic.assembling_company.service;

import acustic.assembling_company.entity.Suppliers;
import acustic.assembling_company.repository.ISuppliersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuppliersService {
    @Autowired
    ISuppliersRepository suppliersRepository;

    public List<Suppliers> getAllSuppliers() {
        return suppliersRepository.findAll();
    }
}
