package acustic.assembling_company.service;

import acustic.assembling_company.entity.ComponentPurchase;
import acustic.assembling_company.repository.IComponentPurchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponentPurchaseService {
    @Autowired
    IComponentPurchase componentPurchase;

    public List<ComponentPurchase> getAllComponentPurchases() {
        return componentPurchase.findAll();
    }
}
