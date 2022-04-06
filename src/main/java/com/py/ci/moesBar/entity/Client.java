package com.py.ci.moesBar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    
    int idClient;
    String name;
    String lastname;
    String email;
    String cellphone;
    
}
