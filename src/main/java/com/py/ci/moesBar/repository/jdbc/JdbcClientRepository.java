/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.repository.jdbc;

import com.py.ci.moesBar.entity.Client;
import com.py.ci.moesBar.repository.ClientRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sneck
 */
@Repository
public class JdbcClientRepository implements ClientRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Client client) {
         return jdbcTemplate.update("insert into client(name,lastname,email,cellphone) values (?,?,?,?)", client.getName(),client.getLastname(),client.getEmail(),client.getCellphone());
    }

    @Override
    public List<Client> getAll() {
        return jdbcTemplate.query("select * from client", (rs, rowNum)
                -> new Client(rs.getInt("id_client"),
                        (rs.getString("name")),
                        (rs.getString("lastname")),
                        rs.getString("email"),
                        rs.getString("cellphone")));
    }

    @Override
    public int update(Client client) {
        return jdbcTemplate.update("update client set name=?, lastname=?, email=?, cellphone=?  where id_client=?", client.getName(), client.getLastname(),
                client.getEmail(), client.getCellphone(),client.getIdClient());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from client where id_client=?", id);
    }

}
