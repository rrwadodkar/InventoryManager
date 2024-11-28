package com.metasoft.inventorymanager.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metasoft.inventorymanager.entityclasses.Warehouse;
import com.metasoft.inventorymanager.service.WarehouseService;

@RestController
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService; 

    @GetMapping("/warehouse/warehouses")
    public ArrayList<Warehouse> getWarehouses() { 
        return warehouseService.getWarehouse(); 
    }

    @PostMapping("/warehouse/warehouse")
    public Warehouse addWarehouse(Warehouse warehouse) { 
        return warehouseService.addWarehouse(warehouse); 
    }

}
