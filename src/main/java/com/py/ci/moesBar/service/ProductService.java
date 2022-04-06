/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.service;

import com.py.ci.moesBar.entity.Product;
import com.py.ci.moesBar.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sneck
 */
@Service
public class ProductService {
    @Autowired 
    ProductRepository productRepository;
    
    public int save(Product product){
        return this.productRepository.save(product);
    }
    
    public List<Product> getAll(){
        return this.productRepository.getAll();
    }
    
    public int update(Product product){
        return this.productRepository.update(product);
    }
    
    public int delete(int idProduct){
        return this.productRepository.deleteById(idProduct);
    }
}
