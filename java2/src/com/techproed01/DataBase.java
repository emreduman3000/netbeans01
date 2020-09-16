/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techproed01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emreduman
 */
public class DataBase implements ICarOperations {

    List<Car> carList=new ArrayList<>();
    
    @Override
    public void carRegisteration(Car car) {
        carList.add(car);
    }

    @Override
    public void carSelling(int id) {
        
        for(int i=0; i< carList.size() ; i++)
        {
            if(carList.get(i).getId()==id)
            {
                carList.remove(i);
                break;
            }
        }
    }

    @Override
    public void carUpdating(int id, Car car)
    {
        for(int i=0; i< carList.size() ; i++)
        {
            if(carList.get(i).getId()==id)
            {         
                carList.set(i,car);
                break;
            }
        }
    }

    @Override
    public void carDisplay() {
        
        for(Car car : carList)
        {
            System.out.println(car.getId()+" - "+car.getBrand()+" - "+car.getColor()+" - "+car.getGear()
            +" - "+car.getMaxVelocity()+" - "+car.getYear());
        }
    }

    	// abstract class ve interface'in en büyük farkı
	// abstract class kullanılırsa sadece bir tane miras alınabilir (extends )
	// interface kullanılırsa birden fazla interface miras alınabilir (implements)
	// eğer abstract kullanırsak içerisinde tüm methodları (abstract + diğerleri) override yapmak zorunda değiliz.
	// eğer interface kullanırsak override yapmak zorundayız.

}
