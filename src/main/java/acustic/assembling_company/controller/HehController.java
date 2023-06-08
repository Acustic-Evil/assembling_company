package acustic.assembling_company.controller;

import acustic.assembling_company.entity.*;
import acustic.assembling_company.service.*;
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

    @Autowired
    SuppliersService suppliersService;

    @Autowired
    AssemblesService assemblesService;

    @Autowired
    ClientsService clientsService;

    @Autowired
    ComponentPurchaseService componentPurchaseService;

    @Autowired
    GoodsPurchaseService goodsPurchaseService;

    @Autowired
    GoodsService goodsService;


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
        return "supplies";
    }

    @GetMapping("/get_components")
    public String getAllComponents(Model model){
        model.addAttribute("columns", columnsArray(Components.class));
        model.addAttribute("rows", componentsService.getAllComponents());
        return "components";
    }

    @GetMapping("/get_suplliers")
    public String getAllSuppliers(Model model){
        model.addAttribute("columns", columnsArray(Suppliers.class));
        model.addAttribute("rows", suppliersService.getAllSuppliers());
        return "suppliers";
    }

    @GetMapping("/get_assembles")
    public String getAllAssembles(Model model){
        model.addAttribute("columns", columnsArray(Assembles.class));
        model.addAttribute("rows", assemblesService.getAllAssembles());
        return "assembles";
    }

    @GetMapping("/get_clients")
    public String getAllClients(Model model){
        model.addAttribute("columns", columnsArray(Clients.class));
        model.addAttribute("rows", clientsService.getAllClients());
        return "clients";
    }

    @GetMapping("/get_component-purchases")
    public String getAllCompPurchases(Model model){
        model.addAttribute("columns", columnsArray(ComponentPurchase.class));
        model.addAttribute("rows", componentPurchaseService.getAllComponentPurchases());
        return "component_purchases";
    }

    @GetMapping("/get_goods-purchases")
    public String getAllGoodsPurchases(Model model){
        model.addAttribute("columns", columnsArray(GoodsPurchase.class));
        model.addAttribute("rows", goodsPurchaseService.getAllGoodsPurchases());
        return "goods_purchases";
    }

    @GetMapping("/get_goods")
    public String getAllGoods(Model model){
        model.addAttribute("columns", columnsArray(Goods.class));
        model.addAttribute("rows", goodsService.getAllGoods());
        return "goods";
    }


}
