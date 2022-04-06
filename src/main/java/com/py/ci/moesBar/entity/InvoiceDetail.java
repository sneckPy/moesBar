/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.py.ci.moesBar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author sneck
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDetail {

    int idInvoiceDetail;
    int idProduct;
    int idInvoice;
    int quantity;
}
