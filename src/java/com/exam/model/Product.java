package com.exam.model;
// Generated Apr 4, 2019 7:50:54 PM by Hibernate Tools 4.3.1



/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private int id;
     private String pname;
     private String brand;
     private String price;

    public Product() {
    }

	
    public Product(int id) {
        this.id = id;
    }
    public Product(int id, String pname, String brand, String price) {
       this.id = id;
       this.pname = pname;
       this.brand = brand;
       this.price = price;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getPrice() {
        return this.price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }




}


