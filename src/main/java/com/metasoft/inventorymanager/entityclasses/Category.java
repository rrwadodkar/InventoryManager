package com.metasoft.inventorymanager.entityclasses;

import jakarta.persistence.*;


import java.util.Set;

@Entity
@Table
public class Category {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer categoryId;
    @Column
    private String categoryName;
    @Column
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Product> products;

    // Getters and Setters
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public Set<Product> getProducts() {
//        return products;
//    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    
}

