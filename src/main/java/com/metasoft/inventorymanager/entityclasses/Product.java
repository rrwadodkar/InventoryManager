package com.metasoft.inventorymanager.entityclasses;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer productId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Integer reorderLevel;
    @Column
    private BigDecimal unitPrice;
    @Column
    private Integer unitsInStock;
    @Column
    private Integer unitsOnOrder;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    @OneToMany(mappedBy = "product")
    private Set<Inventory> inventories;

    @OneToMany(mappedBy = "product")
    private Set<OrderDetails> OrderDetailss;

    // Getters and Setters

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Integer reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Integer unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Integer getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Integer unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Set<Inventory> getInventories() {
        return inventories;
    }

    public void setInventories(Set<Inventory> inventories) {
        this.inventories = inventories;
    }

//    public Set<OrderDetails> getOrderDetailss() {
//        return OrderDetailss;
//    }

//    public void setOrderDetailss(Set<OrderDetails> OrderDetailss) {
//        this.OrderDetailss = OrderDetailss;
//    }
}
