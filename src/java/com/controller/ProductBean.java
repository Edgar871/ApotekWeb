/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.DAO.DAOProduct;
import com.model.pojo.Product;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Edgar Hadhyra J
 */
@ManagedBean
@RequestScoped
public class ProductBean {
    public Product product = new Product();
    public DAOProduct daoProduct = new DAOProduct();
    
    public ProductBean() {
    }
    
    public void deleteProducts(int id){
        System.out.println("id" + id);
        daoProduct.deleteProduct(id);
    }
    
    public void updateProducts(Product editProduct){
        System.out.println(editProduct.getIdObat());
        daoProduct.updateProduct(editProduct);
    }
    
    public void updateProducts(){
        daoProduct.updateProduct(product);
    }
    
    public Product getProductById(){
        String id = product.getIdObat().toString();
        return daoProduct.getbyID(id);
    }
    
    public void addProduct() {
        daoProduct.addProduct(product);
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
    
    public List<Product> getProducts() {
        return daoProduct.retrieveProduct();
    
    }
}
