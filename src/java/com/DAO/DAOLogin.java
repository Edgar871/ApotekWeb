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
import com.model.pojo.Users;

/**
 *
 * @author Asus
 */
public class DAOLogin {
    public void signUp(Users newuser){
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(newuser);
            trans.commit();
        } catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
    
    public List<Users> getBy(String username, String password) {
        Users u = new Users();
        List<Users> user = new ArrayList();
        
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Users where username="
                    + " :username AND password= :password");
            query.setString("username", username);
            query.setString("password", password);
            u = (Users) query.uniqueResult();
            user = query.list();
            
            trans.commit();
        }catch (Exception e){
            System.out.println("Error: " + e);
        }
        return user;
    }
}
