package com.knf.dev.services;

import com.knf.dev.models.Product;
import com.knf.dev.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServices {
    @Autowired
    private ProductRepository repo;

    public ProductServices(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getProducts() {
        return repo.findAll();
    }
}
