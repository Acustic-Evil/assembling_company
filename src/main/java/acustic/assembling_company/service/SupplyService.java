package acustic.assembling_company.service;

import acustic.assembling_company.entity.Supply;
import acustic.assembling_company.repository.ISupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplyService {
    @Autowired
    ISupplyRepository supplyRepository;

    public List<Supply> findAllSupplies() {
        return supplyRepository.findAll();
    }
}
