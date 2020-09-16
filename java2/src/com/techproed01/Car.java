/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techproed01;

/**
 *
 * @author emreduman
 */
public class Car {
    
    private int id, maxVelocity,year;
    private String brand,color,gear;

    public Car(int id, int maxVelocity, int year, String brand, String color, String gear) {
        this.id = id;
        this.maxVelocity = maxVelocity;
        this.year = year;
        this.brand = brand;
        this.color = color;
        this.gear = gear;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getMaxVelocity() {return maxVelocity;}
    public void setMaxVelocity(int maxVelocity) {this.maxVelocity = maxVelocity;}

    public int getYear() { return year;}
    public void setYear(int year) {this.year = year;}

    public String getBrand() { return brand;}
    public void setBrand(String brand) {this.brand = brand;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public String getGear() {return gear;}
    public void setGear(String gear) {this.gear = gear;}
    
    
    
    
}
