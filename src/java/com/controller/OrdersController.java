/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.DAO.DAOOrders;
import com.model.pojo.Orders;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Asus
 */
@ManagedBean
@RequestScoped
public class OrdersController {
    public DAOOrders daoOrders = new DAOOrders();
    public Orders orders = new Orders();
    
    public OrdersController(){
        
    }
    
    public Orders getOrdersById(){
        return daoOrders.getbyID(orders.getName());
    }
    
    public void addOrders(){
        daoOrders.addOrders(orders);
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
    
    public Orders getOrder(){
        return orders;
    }
    
    public List<Orders> getOrders(){
        return daoOrders.retrieveOrders();
    }
}
