/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.py.ci.moesBar.repository;

import com.py.ci.moesBar.entity.Client;
import java.util.List;

/**
 *
 * @author sneck
 */
public interface ClientRepository {

    public int save(Client client);

    public List<Client> getAll();

    public int update(Client client);

    public int deleteById(int id);
}
