package com.model.pojo;
// Generated Oct 17, 2020 10:58:01 PM by Hibernate Tools 4.3.1


import com.DAO.DAOProduct;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.paramValueType;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Product generated by hbm2java
 */
@ManagedBean
@RequestScoped
public class Product  implements java.io.Serializable {


     private Integer idObat;
     private String productName;
     private String type;
     private int stock;
     private Long price;
     private Date expired;
     private Set orderses = new HashSet(0);

    public Product() {
    }

	
    public Product(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
    }
    public Product(String productName, String type, int stock, Long price, Date expired, Set orderses) {
       this.productName = productName;
       this.type = type;
       this.stock = stock;
       this.price = price;
       this.expired = expired;
       this.orderses = orderses;
    }
   
    public Integer getIdObat() {
        return this.idObat;
    }
    
    public void setIdObat(Integer idObat) {
        this.idObat = idObat;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Long getPrice() {
        return this.price;
    }
    
    public void setPrice(Long price) {
        this.price = price;
    }
    public Date getExpired() {
        return this.expired;
    }
    
    public void setExpired(Date expired) {
        this.expired = expired;
    }
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }
    
    public void addProduct() {
        DAOProduct daoProduct = new DAOProduct();
        daoProduct.addProduct(this);
    }
}