///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.controller;
//
//import com.DAO.DAOProduct;
//import java.util.List;
//
///**
// *
// * @author Asus
// */
//public class ProductController {
//    public void save(){
//        DAOProduct prd = new DAOProduct();
//        prd.addProduct(this);
//    }
//    
//    public void update(){
//        DAOProduct prd = new DAOProduct();
//        prd.updateProduct(this);
//        productName = "";
//        type = "";
//        stock = "";
//        price = "";
//        expired = "";
//        idObat = "";
//    }
//    
//    public void delete(){
//        DAOProduct prd = new DAOProduct();
//        prd.deleteProduct(idObat);
//        productName = "";
//        type = "";
//        Integer.toString(stock);
//        price = ""; ini long
//        expired = ""; ini date
//        Integer.toString(idObat);
//    }
//    
//    public String getbyid(){
//        DAOProduct prd = new DAOProduct();
//        List<Product> lPrd = prd.getbyID(idObat);
//        productName = lPrd.get(0).productName;
//        type = lPrd.get(0).type;
//        stock = lPrd.get(0).stock;
//        price = lPrd.get(0).price;
//        expired = lPrd.get(0).expired;
//        return "view_product";
//    }
//    
//    public List<Product> getallrecords(){
//        DAOProduct prd = new DAOProduct();
//        List<Product> lPrd = prd.retrieveProduct();
//        return lPrd;
//    }
//}
//}
