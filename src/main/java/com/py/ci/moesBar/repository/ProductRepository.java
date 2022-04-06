/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.repository;

import com.py.ci.moesBar.entity.Product;
import java.util.List;

public interface ProductRepository {
    
    public int save(Product product);
    
    public List<Product> getAll();
    
    public int update(Product product);
    
    public int deleteById(int id);
}
