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
import com.model.pojo.Product;

/**
 *
 * @author Asus
 */
public class DAOProduct {
    public void addProduct(Product prd){
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            session.save(prd);
            trans.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteProduct(int idP){
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            System.out.println("id" + idP);
            session.beginTransaction();
            Query prd = session.createQuery("delete Product where idObat= :id");
            prd.setParameter("id", idP);
            prd.executeUpdate();
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }
    
    public Product getbyID(String idP){
        Product prd = new Product();
        
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            Query query = session.createQuery("from Product where id_obat= :id");
            query.setParameter("id", idP);
            prd = (Product) query.uniqueResult();
            trans.commit();
        }catch (Exception e){
            
        }
        return prd;
    }
    
    public List<Product> retrieveProduct(){
        
        List stud = new ArrayList();
        Product stud1 = new Product();
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            trans = session.beginTransaction();
            Query query = session.createQuery("from Product");
            stud = query.list();
            trans.commit();
        } catch (Exception e){
            
        }
        return stud;
    }
    
    public void updateProduct(Product prd){
        Transaction trans = null;
        Session session = ApotekWebUtil.getSessionFactory().openSession();
        try{
            System.out.println("prd" + prd.getIdObat());
            trans = session.beginTransaction();
            session.update(prd);
            trans.commit();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
