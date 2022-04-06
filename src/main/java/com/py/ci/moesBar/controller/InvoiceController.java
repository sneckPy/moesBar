/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.controller;

import com.py.ci.moesBar.entity.Invoice;
import com.py.ci.moesBar.service.InvoiceService;
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
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @PostMapping("/saveinvoice")
    public int save(@Validated @RequestBody Invoice invoice) {
        return this.invoiceService.save(invoice);
    }

    @GetMapping()
    public List<Invoice> getAll() {
        return this.invoiceService.getAll();
    }

    @PutMapping("/updateinvoice/{id}")
    public int update(@PathVariable int id, @Validated @RequestBody Invoice invoice) {
        return this.invoiceService.update(invoice);
    }

    @DeleteMapping(path = "/deleteinvoice/{id}")
    public int delete(@PathVariable int id) {
        return this.invoiceService.delete(id);
    }

}
