package acustic.assembling_company.service;

import acustic.assembling_company.entity.GoodsPurchase;
import acustic.assembling_company.repository.IGoodsPurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsPurchaseService {
    @Autowired
    IGoodsPurchaseRepository goodsPurchaseRepository;

    public List<GoodsPurchase> getAllGoodsPurchases() {
        return goodsPurchaseRepository.findAll();
    }
}
