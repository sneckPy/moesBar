/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.service;

import com.py.ci.moesBar.entity.Client;
import com.py.ci.moesBar.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sneck
 */

@Service
public class ClientService {
    
    @Autowired
    ClientRepository clientRepository;
    
    public int save(Client client){
        return this.clientRepository.save(client);
    }
    
    public List<Client> getAll(){
        return this.clientRepository.getAll();
    }
    
    public int update(Client client){
        return this.clientRepository.update(client);
    }
    
    public int delete(int idClient){
        return this.clientRepository.deleteById(idClient);
    }
}
