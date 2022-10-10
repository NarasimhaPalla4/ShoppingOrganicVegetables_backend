package com.knf.dev.controllers;

import com.knf.dev.models.Product;
import com.knf.dev.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/auth")
public class ProductController {
    @Autowired
    private ProductServices service;

    public ProductController(ProductServices service) {
        this.service = service;
    }

    @CrossOrigin(origins = "http://localhost:3000/")
    @GetMapping("/productlist")
    public List<Product> getProduct(){
        return service.getProducts();
    }
}
