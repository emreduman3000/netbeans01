/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author emreduman
 */
public class SingletonExample {
    
    
    private static SingletonExample instance;

    private SingletonExample()
    {
        
    }

    public static SingletonExample getInstance(){

        if (instance == null)
        {
            instance = new SingletonExample();
        }

        return instance;
    }
}
