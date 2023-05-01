package com.devsuperior.demo.entities;

public class Product {
    private long id;
    private String name;
    private double price;  
    private Department departament;

public Product(){

}



    public Product(long id, String name, double price, Department departament) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.departament = departament;
}



    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Department getDepartament() {
        return departament;
    }
    public void setDepartament(Department departament) {
        this.departament = departament;
    }

    
}
