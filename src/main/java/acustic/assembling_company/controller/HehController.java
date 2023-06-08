package acustic.assembling_company.controller;

import acustic.assembling_company.entity.Supply;
import acustic.assembling_company.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HehController {

    @Autowired
    SupplyService supplyService;
    @GetMapping("/get_supplies")
    public List<Supply> getAllSupplies(){
        return supplyService.findAllSupplies();
    }
}
