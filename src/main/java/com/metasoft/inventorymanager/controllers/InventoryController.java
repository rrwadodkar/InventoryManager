package com.metasoft.inventorymanager.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metasoft.inventorymanager.entityclasses.Inventory;
import com.metasoft.inventorymanager.service.InventoryService;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService; 

    @GetMapping("/inventory/inventories")
    public ArrayList<Inventory> getInventories() { 
        return inventoryService.getInventory(); 
    }
    @GetMapping("/inventory/warehouseInventory")
    public ArrayList<Inventory> getInventoryByWarehouse(@RequestParam Integer warehouse) { 
        return inventoryService.getInventoryByWarehouseId(warehouse);

    }

    @PostMapping("/inventory/inventory")
    public Inventory addInventory(Inventory inventory) { 
        return inventoryService.addInventory(inventory); 
    }
}
