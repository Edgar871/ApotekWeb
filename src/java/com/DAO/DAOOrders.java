/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DAO;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.util.ApotekWebUtil;
import com.model.pojo.Orders;

/**
 *
 * @author Asus
 */
public class DAOOrders {
    public void addOrders(Orders ord){
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(ord);
            trans.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public Orders getbyID(String idO){
        Orders ord = new Orders();
        
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Orders where id= :id");
            query.setString("id", idO);
            ord = (Orders) query.uniqueResult();
            trans.commit();
        }catch (Exception e){
            
        }
        return ord;
    }
    
    public List<Orders> retrieveOrders(){
        
        List<Orders> stud = new ArrayList();
        Orders stud1 = new Orders();
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Orders");
            stud = query.list();
            trans.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
        return stud;
    }
}
