/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.service;

import com.py.ci.moesBar.entity.InvoiceDetail;
import com.py.ci.moesBar.repository.InvoiceDetailRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sneck
 */
@Service
public class InvoiceDetailService {
    
    @Autowired
    InvoiceDetailRepository invoiceDetailRepository;
    
    public int save(InvoiceDetail invoiceDetail){
        return this.invoiceDetailRepository.save(invoiceDetail);
    }
    
    public List<InvoiceDetail> getAll(){
        return this.invoiceDetailRepository.getAll();
    }
    
    public int update(InvoiceDetail invoiceDetail){
        return this.invoiceDetailRepository.update(invoiceDetail);
    }
    
    public int delete(int idInvoiceDetail){
        return this.invoiceDetailRepository.deleteById(idInvoiceDetail);
    }
}
