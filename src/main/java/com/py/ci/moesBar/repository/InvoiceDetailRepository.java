/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.repository;

import com.py.ci.moesBar.entity.InvoiceDetail;
import java.util.List;

/**
 *
 * @author sneck
 */
public interface InvoiceDetailRepository {

    public int save(InvoiceDetail invoiceDetail);

    public List<InvoiceDetail> getAll();

    public int update(InvoiceDetail invoiceDetail);

    public int deleteById(int id);
}
