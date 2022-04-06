/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.controller;

import com.py.ci.moesBar.entity.InvoiceDetail;
import com.py.ci.moesBar.service.InvoiceDetailService;
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
@RequestMapping("/invoiceDetails")
public class InvoiceDetailController {
    
    @Autowired
    InvoiceDetailService invoiceDetailService;
    
    
    @PostMapping("/saveInvoiceDetail")
    public int save(@Validated @RequestBody InvoiceDetail invoiceDetail) {
        return this.invoiceDetailService.save(invoiceDetail);
    }

    @GetMapping()
    public List<InvoiceDetail> getAll() {
        return this.invoiceDetailService.getAll();
    }

    @PutMapping("/updateInvoiceDetail/{id}")
    public int update(@PathVariable int id, @Validated @RequestBody InvoiceDetail invoiceDetail) {
        return this.invoiceDetailService.update(invoiceDetail);
    }

    @DeleteMapping(path = "/deleteInvoiceDetail/{id}")
    public int delete(@PathVariable int id) {
        return this.invoiceDetailService.delete(id);
        
    }
}
