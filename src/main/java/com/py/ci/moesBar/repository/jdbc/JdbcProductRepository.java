/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.repository.jdbc;

import com.py.ci.moesBar.entity.Product;
import com.py.ci.moesBar.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcProductRepository implements ProductRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Product product) {
        return jdbcTemplate.update("insert into product(name,description,price) values (?,?,?)", product.getName(), product.getDescription(), product.getPrice());
    }

    @Override
    public List<Product> getAll() {
        return jdbcTemplate.query("select * from product", (rs, rowNum)
                -> new Product(rs.getInt("id_product"),
                        (rs.getString("name")),
                        (rs.getString("description")),
                        rs.getString("price")));
    }

    @Override
    public int update(Product product) {
        return jdbcTemplate.update("update product set name=?, description=?, price=? where id_product=?", product.getName(),product.getDescription(),product.getPrice(),product.getProductId());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from product where id_product=?", id);
    }

}
