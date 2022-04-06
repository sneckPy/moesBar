/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.controller;

import com.py.ci.moesBar.entity.Product;
import com.py.ci.moesBar.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sneck
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/saveProduct")
    public int save(@Validated @RequestBody Product product) {
        return this.productService.save(product);
    }

    @GetMapping()
    public List<Product> getAll() {
        return this.productService.getAll();
    }

    @PutMapping("/updateProduct/{id}")
    public int update(@PathVariable int id, @Validated @RequestBody Product product) {
        return this.productService.update(product);
    }

    @DeleteMapping(path = "/deleteProduct/{id}")
    public int delete(@PathVariable int id) {
        return this.productService.delete(id);
        
    }

}
