/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.controller;

import com.py.ci.moesBar.entity.Client;
import com.py.ci.moesBar.service.ClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/saveClient")
    public int save(@Validated @RequestBody Client client) {
        return this.clientService.save(client);
    }

    @GetMapping()
    public List<Client> getAll() {
        return this.clientService.getAll();
    }

    @PutMapping("/updateClient/{id}")
    public int update(@PathVariable int id, @Validated @RequestBody Client client) {
        return this.clientService.update(client);
    }

    @DeleteMapping(path = "/deleteClient/{id}")
    public int delete(@PathVariable int id) {
        return this.clientService.delete(id);

    }

}
