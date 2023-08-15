package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.ProductDao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.mapping.Join;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;
    public Product(){
    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "PRODUCT_ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
