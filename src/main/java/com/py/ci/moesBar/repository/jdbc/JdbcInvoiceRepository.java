/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.repository.jdbc;

import com.py.ci.moesBar.entity.Invoice;
import com.py.ci.moesBar.repository.InvoiceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sneck
 */
@Repository
public class JdbcInvoiceRepository implements InvoiceRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Invoice invoice) {
        return jdbcTemplate.update("insert into invoice(id_client) values (?)", invoice.getIdClient());
    }

    @Override
    public List<Invoice> getAll() {
        return jdbcTemplate.query("select * from invoice", ((rs, rowNum)
                -> new Invoice(rs.getInt("id_invoice"),
                        rs.getInt("id_client"))));
    }

    @Override
    public int update(Invoice invoice) {
        return jdbcTemplate.update("update invoice set id_client=? where id_invoice=?", invoice.getIdClient(),invoice.getIdInvoice());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from invoice where id_invoice=?", id);
    }
}
