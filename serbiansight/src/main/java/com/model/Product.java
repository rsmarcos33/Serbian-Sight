package com.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;
    @Column(unique = true)
    @Size(min = 5, message = "*Name must have at least 5 characters")
    @NotNull
    private String name;
    @Column
    @Size(min = 10, message = "*Name must have at least 10 characters")
    @NonNull
    private String description;
    @Column
    @Min(value = 0, message = "*Quantity has to be non negative number")
    private Integer quantity;
    @Column
    @NotNull(message = "Price cannot be 0")
    @DecimalMin(value = "0.00", message = "*Price has to be non negative number")
    private BigDecimal price;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
