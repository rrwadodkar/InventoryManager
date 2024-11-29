package com.metasoft.inventorymanager.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.metasoft.inventorymanager.entityclasses.Inventory;
import com.metasoft.inventorymanager.service.InventoryService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


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
        System.out.println(inventory.getQuantity());
        return inventoryService.addInventory(inventory); 
    }

    @PutMapping("/inventory/{id}")
    public Inventory putMethodName(@PathVariable Integer id, @RequestBody Inventory inventory) {
        System.out.println(inventory.toString());
        return inventoryService.updateInventory(id, inventory);       

    }
}
