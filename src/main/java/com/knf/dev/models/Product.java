package com.knf.dev.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="product")
@Table
public class Product {
    @Id
    private long id;
    private String image;
    private String name;
    private String price;
    private int qty;

    public Product() {
    }

    public Product(long id, String name, String price, String image, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image=image;
        this.qty=qty;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
