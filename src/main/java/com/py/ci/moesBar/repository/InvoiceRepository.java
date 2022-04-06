/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.py.ci.moesBar.repository;

import com.py.ci.moesBar.entity.Invoice;
import java.util.List;

/**
 *
 * @author sneck
 */
public interface InvoiceRepository {

    public int save(Invoice invoice);

    public List<Invoice> getAll();

    public int update(Invoice invoice);

    public int deleteById(int id);
}
