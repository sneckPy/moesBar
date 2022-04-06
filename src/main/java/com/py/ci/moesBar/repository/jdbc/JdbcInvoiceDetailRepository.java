/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.repository.jdbc;

import com.py.ci.moesBar.entity.InvoiceDetail;
import com.py.ci.moesBar.repository.InvoiceDetailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sneck
 */
@Repository
public class JdbcInvoiceDetailRepository implements InvoiceDetailRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public int save(InvoiceDetail invoiceDetail) {
        return jdbcTemplate.update("insert into invoice_detail(id_product,quantity,id_invoice) values (?,?,?)", invoiceDetail.getIdProduct(),invoiceDetail.getQuantity(),invoiceDetail.getIdInvoice());
    }

    @Override
    public List<InvoiceDetail> getAll() {
        return jdbcTemplate.query("select * from invoice_detail", (rs, rowNum)
                -> new InvoiceDetail(rs.getInt("id_Invoice_detail"),
                        (rs.getInt("id_product")),
                        (rs.getInt("quantity")),
                        rs.getInt("id_invoice")));
    }

    @Override
    public int update(InvoiceDetail invoiceDetail) {
        return jdbcTemplate.update("update invoice_detail set id_product=?, quantity=?, id_invoice=? where id_invoice_detail=?", invoiceDetail.getIdProduct(),invoiceDetail.getQuantity(),
                invoiceDetail.getIdInvoice(),invoiceDetail.getIdInvoiceDetail());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from invoice_detail where id_invoice_detail=?", id);
    }

}
