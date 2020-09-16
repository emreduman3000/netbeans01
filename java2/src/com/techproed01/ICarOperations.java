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
public interface ICarOperations {
    
    public void carRegisteration(Car car);
    public void carSelling(int id);
    public void carUpdating(int id ,Car car);
    public void carDisplay();
}
