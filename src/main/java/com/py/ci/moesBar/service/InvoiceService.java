/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.service;

import com.py.ci.moesBar.entity.Invoice;
import com.py.ci.moesBar.repository.InvoiceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sneck
 */
@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    
    public int save(Invoice invoice){
        return this.invoiceRepository.save(invoice);
    }
    
    public List<Invoice> getAll(){
        return this.invoiceRepository.getAll();
    }
    
    public int update(Invoice invoice){
        return this.invoiceRepository.update(invoice);
    }
    
    public int delete(int idInvoice){
        return this.invoiceRepository.deleteById(idInvoice);
    }
    
}
