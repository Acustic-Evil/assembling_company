package acustic.assembling_company.controller;

import acustic.assembling_company.entity.Components;
import acustic.assembling_company.entity.Supply;
import acustic.assembling_company.service.ComponentsService;
import acustic.assembling_company.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HehController {

    @Autowired
    SupplyService supplyService;

    @Autowired
    ComponentsService componentsService;

    private List<String> columnsArray(Class<?> entityClass) {
        Field[] columns = entityClass.getDeclaredFields();
        List<String> entityColumns = new ArrayList<>();
        for (Field column : columns) {
            entityColumns.add(column.getName());
        }
        return entityColumns;
    }
    @GetMapping("/get_supplies")
    public String getAllSupplies(Model model){
        model.addAttribute("columns", columnsArray(Supply.class));
        model.addAttribute("rows", supplyService.findAllSupplies());
        return "index";
    }

    @GetMapping("/get_components")
    public String getAllComponents(Model model){
        model.addAttribute("columns", columnsArray(Components.class));
        model.addAttribute("rows", componentsService.getAllComponents());
        return "index";
    }

}
