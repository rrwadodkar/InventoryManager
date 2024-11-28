package com.metasoft.inventorymanager.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metasoft.inventorymanager.entityclasses.Supplier;
import com.metasoft.inventorymanager.repository.SupplierRepository;

@Service
public class SupplierService {
    @Autowired
    private SupplierRepository supplierRepository; 

    public ArrayList<Supplier> getSuppliers() { 
        ArrayList<Supplier> suppliers = new ArrayList<Supplier>(); 
        supplierRepository.findAll().forEach(suppliers::add);
        return suppliers; 
    }

    public Supplier addSupplier(Supplier supplier) { 
        return supplierRepository.save(supplier);
    }
}
